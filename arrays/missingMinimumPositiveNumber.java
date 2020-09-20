package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class missingMinimumPositiveNumber {

	private int getMissingInteger(int[] input){

		int output=1;
		
		Arrays.sort(input);
		
		for(int i=0; i < input.length - 1; i++){
			
			if( input[i] == input[i+1]){
				continue;	
			}		
			if( input[i] > 0 && input[i + 1] != input[i] + 1 ){
				output= input[i] + 1;
				break;
			}
		}
		return output;
	}



	@Test
	public void example1(){
		int[] input = {-1,-2,-3};
		System.out.println(getMissingInteger(input));
	}
	
	@Test
	public void example2(){
		int[] input = {0,1,2,3,5};
		System.out.println(getMissingInteger(input));
	}
	
	@Test
	public void example3(){
		int[] input = {1,3,4,0,-2};
		System.out.println(getMissingInteger(input));
	}
	
}
