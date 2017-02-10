package Searching;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BinarySearchTest {
	
	public static final int ARRAY_SIZE = 10;
	public static final int RANGE = 10;
	public static final int TARGET = 5;

	public static void main(String[] args) {
		
		Random rand = new Random();
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> array = new ArrayList<>();
		
		for(int i = 0; i < ARRAY_SIZE; i++){
			set.add(rand.nextInt(RANGE));
		}
		
		array.addAll(set);
		
		// Iterative test:
		
		System.out.println("Set created to order array was: " + set);
		System.out.println("Array we will be searching is: " + array);
		int targetFound = Search.binarySearch(array, TARGET);
		System.out.println("Target position found was: " + targetFound);
		
		// Recursive test:
		
		System.out.println("\nArray we will be searching is: " + array);
		targetFound = Search.recursiveBinarySearch(array, TARGET, 0, array.size()-1);
		System.out.println("Target position found was: " + targetFound);
		
	}

}
