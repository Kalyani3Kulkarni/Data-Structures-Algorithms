package stack;

public class Insertion_Sort {
	public void insertion_sort(int[] arr) {
		int arrlen = arr.length	;
		for(int i=1; i<arrlen; i++) {
			int tempi=i;
			int temp = arr[i];
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>temp) {
					tempi = j;
					arr[j+1] = arr[j];
				}
			}
			arr[tempi] = temp;
		 }
		return;
	}
	
	
	public static void main(String args[]) {
		int[] arr = {2,7,5,4,11,1,0,-1,2,1,85,0};
		Insertion_Sort is = new Insertion_Sort();
		is.insertion_sort(arr);
		int arrlen = arr.length;
		for(int i=0; i<arrlen; i++) {
			System.out.println(arr[i]);
		}
	}
}
