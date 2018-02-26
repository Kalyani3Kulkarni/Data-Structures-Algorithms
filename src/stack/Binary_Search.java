package stack;

public class Binary_Search {
	public int BinarySearch(int[] arr, int low, int high, int target) {
		if (low > high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid] == target )
			return mid;
		else if(arr[mid] > target)
			return BinarySearch(arr,low,mid-1,target);
		else
			return BinarySearch(arr,mid+1,high,target);
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Binary_Search bs = new Binary_Search();
		int result = bs.BinarySearch(arr,0,arr.length-1,10);
		System.out.println(result);
		}
	}

