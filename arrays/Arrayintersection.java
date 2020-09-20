package ds.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Arrayintersection {

	public Set<Integer> findIntersection(int[] firstArray, int[] secondArray) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if(firstArray[i] == secondArray[j]) {
					set.add(firstArray[i]);
				}
			}
		} 
		return set;
	}
	
	@Test
	public void example1() {
		int firstArray[] = {8,100,-43,8,8,2};
		int secondArray[] = {2,6,7,8,8,8,8,-43,8};
		Set<Integer> intersectedElements = findIntersection(firstArray, secondArray);
		System.out.println("Array Intersection : " + intersectedElements);
	}
	
	@Test
	public void example2() {
		int firstArray[] = {100,-43,8,54,67,22};
		int secondArray[] = {2,6,7,54,8,-43};
		Set<Integer> intersectedElements = findIntersection(firstArray, secondArray);
		System.out.println("Array Intersection : " + intersectedElements);
	}
	
	@Test
	public void example3() {
		int firstArray[] = {100,-8};
		int secondArray[] = {2,6,7,9,8,-43};
		Set<Integer> intersectedElements = findIntersection(firstArray, secondArray);
		System.out.println("Array Intersection : " + intersectedElements);
	}
}
