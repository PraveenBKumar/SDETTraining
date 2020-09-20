package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubArrayMatchSum_HashIngAlgorithm {

	private int[] getExactSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int sum_so_far = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum_so_far += numbers[i];
			int diff = sum_so_far - target;
			
			if(map.containsKey(diff)) {
				System.out.println("Found the sub array : { "+(map.get(diff)+1)+" , "+ i + " } ");
			}
			map.put(sum_so_far, i);
		}
		throw new RuntimeException("Error");
	}
	
	@Test
	public void example1() {
		int[] numbers = {1,2,2,1,2};
		int target = 3;
		getExactSum(numbers, target);
	}
	
	@Test
	public void example2() {
		int[] numbers = {2,4,2,4,4};
		int target = 8;
		getExactSum(numbers, target);
	}
	
	@Test
	public void example3() {
		int[] numbers = {4,8,1,8,5,6,9};
		int target = 3;
		getExactSum(numbers, target);
	}
}
