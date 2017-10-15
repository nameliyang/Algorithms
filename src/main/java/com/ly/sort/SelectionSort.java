package com.ly.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	
	public static void selectionSort(int [] array){
		for(int  i = 0;i<array.length;i++){
			int min = array[i];
			for(int j = i+1;j<array.length;j++){
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		for(int i = 0;i<10;i++){
			arr[i] = new Random().nextInt(1000);
		}
		System.out.println("list :"+ Arrays.asList(arr));
	}
}
