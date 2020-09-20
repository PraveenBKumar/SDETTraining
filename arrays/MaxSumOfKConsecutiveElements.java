package ds.arrays;

import org.junit.Test;

public class MaxSumOfKConsecutiveElements {

	
	//time complexity
	//window sliding
	@Test
	public void maxSum() {
		
		int[] arr = {1,33,8,22,80};
		int temp = 0, max = 0 , k = 3;
		
		for (int i = 0; i < k; i++) {
			temp = temp + arr[i];
		}
		
		max = temp;
		
		for (int j = k; j < arr.length; j++) {
			temp = temp + arr[j] - arr[j-k];
			max =Math.max(max, temp); 
		}
		System.out.println(max);
	}
	
	
}
