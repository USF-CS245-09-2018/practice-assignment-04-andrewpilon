// Andrew Pilon

public class SelectionSort implements SortingAlgorithm {
	
	public void sort(int [] arr) {
		int len = arr.length;
		for(int i=0; i<len-1; i++) { // iterate through arr items
			int min = i;
			for(int j=i+1; j<len; j++) { // iterate through arr right of i
				if(arr[j]<arr[min]) {
					min = j; // get minimum value index
				}
			}
			int temp = arr[min]; // put min at front of arr
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}