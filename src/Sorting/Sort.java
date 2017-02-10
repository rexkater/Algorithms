package Sorting;

import java.util.ArrayList;

public class Sort {
	
	// Insertion Sort
	
	public static void InsertionSort(ArrayList<Integer> array){
		
		int j;
		int temp;
		
		for(int i = 1; i < array.size(); i++){
			j = i;
			while(j > 0 && array.get(j) < array.get(j-1)){
				temp = array.get(j);
				array.set(j, array.get(j-1));
				array.set(j-1, temp);
				j--;
			}
		}
		
	}
	
	// Merge Sort
	
	public static ArrayList<Integer> MergeSort(ArrayList<Integer> array, int low, int high){
		
		if(array.size() == 1){
			return array;
		}
		
		else{
			
			int mid = (array.size()-1)/2;
			
			ArrayList<Integer> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();
			
			for(int i = 0; i <= mid; i++){
				a.add(array.get(i));
			}
			
			for(int j = mid + 1; j < array.size(); j++){
				b.add(array.get(j));
			}
			
			return merge(MergeSort(a, low, mid), MergeSort(b, mid +1, high));
			
			}
		}

	private static ArrayList<Integer> merge(ArrayList<Integer> array1, ArrayList<Integer> array2) {
		
		ArrayList<Integer> array = new ArrayList<>();
		int i = 0, j = 0;
		
			while(i < array1.size() && j < array2.size()){
				
				if(array1.get(i) < array2.get(j)){
					array.add(array1.get(i));
					i++;
				}
				
				else{
					array.add(array2.get(j));
					j++;
				}
			}
			
			if(i == array1.size()){
				for(int p = j; p < array2.size(); p++){
					array.add(array2.get(p));
				}
			}
			
			else if(j == array2.size()){
				for(int p = i; p < array1.size(); p++){
					array.add(array1.get(p));
				}
			}
				
			return array;
	}

}
