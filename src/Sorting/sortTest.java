package Sorting;

import java.util.ArrayList;
import java.util.Random;

public class sortTest {
	
	private static final int ARRAY_SIZE = 10;
	private static final int BOUND = 10;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		Random rand = new Random();
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			array.add(rand.nextInt(BOUND));
			array2.add(rand.nextInt(BOUND));
		}
		
		// Insertion sort test:

		System.out.println("Array before insertion sort: " + array);
		Sort.InsertionSort(array);
		System.out.println("Array after insertion sort: " +array);
		
		// Merge sort test:
		
		System.out.println("\nArray before merge sort: " + array2);
		array2 = Sort.MergeSort(array2, 0, array2.size()-1);
		System.out.println("Array before merge sort: " + array2);
		
	}


}
