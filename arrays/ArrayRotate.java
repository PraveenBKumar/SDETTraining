package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotate {

	public int[] rotate(int[] numbers, int target) {  
		
        //Rotate the given array by n times toward right    
        for(int i = 0; i < target; i++){    
            int j, last;       
            last = numbers[numbers.length-1];    
            for(j = numbers.length-1; j > 0; j--){      
            	numbers[j] = numbers[j-1];    
            }    
            numbers[0] = last;    
        }       
        return numbers;  
	}
	
	@Test
	public void example1() {
		int[] numbers = { 2, 3, 1, 4, 7, 8 };
		int target = 3;
		int[] afterRotate = rotate(numbers, target);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(afterRotate));
	}
	
	@Test
	public void example2() {
		int[] numbers = { 2, -3, 1, 4, 7, 8 };
		int target = 4;
		int[] afterRotate = rotate(numbers, target);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(afterRotate));
	}
	
	@Test
	public void example3() {
		int[] numbers = { 2, 3, 1, 4, 7, 8 };
		int target = 10;
		int[] afterRotate = rotate(numbers, target);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(afterRotate));
	}
}
