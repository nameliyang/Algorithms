package com.ly.search;

public class BinarySearch {
	
	
	public static int findIndexBybinarySearch(int[] array,int target){
		int low = 0;
		int high = array.length-1;
		int temp = (low+high)/2;
		while(low < high){
			if(target ==  array[temp]){
				return temp;
			}else if(array[temp] < target){
				low = temp;
			}else{
				high = temp;
			}
			temp = (low+high)/2;
		}
		throw new RuntimeException("not found element ="+target);
	}
	
	public static void main(String[] args) {
		int[] array = new int[1000];
		for(int i = 0;i<array.length;i++){
			array[i] = i;
		}
		int findIndexBybinarySearch = BinarySearch.findIndexBybinarySearch(array, 100);
		System.out.println(findIndexBybinarySearch);
	}
}
