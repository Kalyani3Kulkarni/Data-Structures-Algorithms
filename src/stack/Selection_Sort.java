package stack;

public class Selection_Sort {
	public void selection_sort(int[] arr) {
		int arrlen = arr.length,min=0;
		for(int i=0;i<arrlen;i++) {
			min=i;
			for(int j=i+1;j<arrlen;j++) {
				if(arr[i] > arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return;
	}
	
	public static void main(String args[]) {
		int[] arr = {2,7,5,4};
		Selection_Sort ss = new Selection_Sort();
		ss.selection_sort(arr);
		int arrlen = arr.length;
		for(int i=0; i<arrlen; i++) {
			System.out.println(arr[i]);
		}
	}
}
