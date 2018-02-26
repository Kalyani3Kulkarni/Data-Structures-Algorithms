package stack;

import java.util.Random;

public class Bubble_Sort {
	public void bubble_sort(int[] arr) {
		long startTime = System.currentTimeMillis();
		int SwapCount =-1, arrlen = arr.length,j=0,k=0;
		while(SwapCount != 0) {
			SwapCount =0;
			for(int i=1; i<arrlen; i++) {
				if(arr[i-1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					SwapCount++;
					k++;
				}
			}
			j++;
			arrlen--;
		}
		System.out.println("Number of iteration is" +(k*j));
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("time is " +elapsedTime);
		return;
	}
	
	public static void main(String args[]) {
		int[] arr = new int[20000];
		Random rand = new Random();
		for (int j = 0; j<20000; j++)
		{
		    arr[j] = rand.nextInt(88)+13;
		}
		Bubble_Sort bs = new Bubble_Sort();
		bs.bubble_sort(arr);
		int arlen = arr.length;
		for(int i=0; i<arlen; i++) {
			System.out.println(arr[i]);
		}
	}
}
