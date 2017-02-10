package Searching;

import java.util.ArrayList;

public class Search {
	
	public static int binarySearch(ArrayList<Integer> array, int target){
		
		int low = 0;
		int high = array.size()-1;
		int mid = (high + low)/2;
		
		// When high equals low, thats the target number. It has ">=" so it iterates again and can return the value.
		
		while(high >= low){
			if(target < array.get(mid)){
				// High = mid - 1 because we don't want to compare again with the former mid value.
				high = mid - 1;
				mid = (high+low)/2;
			}
			
			else if(target > array.get(mid)){
				// Low = mid + 1 because we don't want to compare again with the former mid value.
				low = mid + 1;
				mid = (high+low)/2;
			}
			
			else{
				return mid;
			}
		}
		
		return -1;
		
	}
	
	public static int recursiveBinarySearch(ArrayList<Integer> array, int target, int low, int high){
		
		int mid = (high+low)/2;
		
		// Order matters in this structure.
		
		if(array.get(mid) == target){
			return mid;
		}
		
		else if(high <= low){
			return -1;
		}
		
		else if(target < array.get(mid)){
			return recursiveBinarySearch(array, target, low, mid-1);
		}
		
		else return recursiveBinarySearch(array, target, mid +1, high);
	}
		
}
