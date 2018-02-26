package stack;

import java.util.Random;

public class Quick_Sort {
	
	public int pivot(int [] arr, int low, int high) {
		Random r = new Random();
		//int randnum = r.nextInt((high - low) + 1) + low;
		//System.out.println("Random number is" +randnum);
		int mid = (low+high)/2;
		int pivot = arr[mid];
		int j=low-1;
		for(int i=low;i<high;i++) {
			if(arr[i]<=pivot) {
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i]=temp;
			}
		}
		int temp = arr[j+1];
		arr[j+1] = pivot;
		arr[high] = temp;
		return j+1;

	}
	public void quick_sort(int[] arr,int low, int high) {
		/*choosing a pivot: Good practice to select pivot is to select it randomly because if we select first or last 
		 * as pivot it would cause worst case performance for almost sorted or almost reverse sorted array*/
		if(low > high)
			return;
		int partition = pivot(arr, low, high);
		quick_sort(arr,low,partition-1);
		quick_sort(arr,partition+1,high);
	}
	
	
	
	public static void main(String args[]) {
		int[] arr = {2,4,5,6,-1,0,2};
		Quick_Sort qs = new Quick_Sort();
		int arrlen = arr.length;
		qs.quick_sort(arr,0,arrlen-1);
		for(int i=0; i<arrlen; i++) {
			System.out.println(arr[i]);
		}
	}
}
