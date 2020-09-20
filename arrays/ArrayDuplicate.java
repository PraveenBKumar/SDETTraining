package ds.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ArrayDuplicate {

	private List<Integer> getDuplicatesInArray(int[] input) {
		List<Integer> output=new ArrayList<Integer>();
		Map<Integer,Integer> nonDuplicate=new HashMap<Integer,Integer> ();
		for(int i=0;i<input.length;i++){
			if(nonDuplicate.containsKey(input[i])) {
				output.add(input[i]);
			}
			
			nonDuplicate.put(input[i],i);
			
		}
		return output;
	}
	
	@Test
	public void testData() {
		int input[]= {1,2,1,3,4,5,3,1};
		System.out.println(getDuplicatesInArray(input));
	}
	
	@Test
	public void testData1() {
		int input[]= {1,2,-1,0,0,3,4,5,3,1,-1};
		System.out.println(getDuplicatesInArray(input));
	}
	
	
}
