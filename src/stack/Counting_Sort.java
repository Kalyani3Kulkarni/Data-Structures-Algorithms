package stack;

public class Counting_Sort {

	public int[] counting_sort(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] res = new int[max+1];
		for(int i=0;i<arr.length; i++) {
			//int temp = arr[i];
			//int add = res[temp];
			res[arr[i]] = (res[arr[i]] + 1);
		}
		int j=0;
		for(int i=0;i<res.length; i++) {
			if(res[i]!=0) {
				int temp = res[i];
				while(temp>0) {
					arr[j] = i;
					j++;
					temp--;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String args[]) {
		int[] arr = {2,4,5,6,0,2,18,9};
		Counting_Sort cs = new Counting_Sort();
		int arrlen = arr.length;
		int[] result = new int[arrlen];
		result = cs.counting_sort(arr);
		for(int i=0; i<arrlen; i++) {
			System.out.println(result[i]);
		}
	}
}
