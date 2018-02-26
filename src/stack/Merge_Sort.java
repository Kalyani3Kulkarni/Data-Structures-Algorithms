package stack;

public class Merge_Sort {
	public int[] merge_sort(int[] arr,int low,int high) {
		if(low == high) {
			int[] arry = new int[1];
			arry[0] = arr[low];
			return arry;
			}
		int mid = (low+high)/2;
		int[] arr1 = merge_sort(arr,low,mid);
		int[] arr2 = merge_sort(arr,mid+1,high);
		int arr1len = arr1.length;
		int arr2len = arr2.length;
		int[] result = new int[arr1.length + arr2.length];
		int i=0, j=0, k=0;
		while(i<=(arr1len-1) || (j<=arr2len-1)) {
			if(i == arr1len) {
				while(j<arr2len) {
					result[k] = arr2[j];
					k++;j++;
				}
			}
			else if(j == arr2len) {
				while(i<arr1len) {
					result[k] = arr1[i];
					k++;i++;
				}
			}
			else {
			if(arr1[i]>arr2[j]){
				result[k] = arr2[j];
				k++;j++;
			}
			else if((arr1[i]<arr2[j])) {
				result[k] = arr1[i];
				i++;k++;
			}
			else {
				result[k] = arr1[i];
				k++;
				result[k] = arr1[i];
				i++;j++;k++;
			}
		  }
		}
		return result;
	}
	
	
	public static void main(String args[]) {
		int[] arr = {3,1,19,0,17,72,};
		Merge_Sort ms = new Merge_Sort();
		int arrlen = arr.length;
		int[] result = new int[arrlen];
	    result = ms.merge_sort(arr,0,arrlen-1);
		for(int i=0; i<arrlen; i++) {
			System.out.println(result[i]);
		}
	}
}
