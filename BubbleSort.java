// Andrew Pilon

public class BubbleSort implements SortingAlgorithm {
	
	public void sort(int [] arr) {
		int len = arr.length;
		for(int i=0; i<len-1; i++) { // iterate through array items
			boolean swapped = false;
			for(int j=0; j<len-i-1; j++) { // iterate through all items to the right of [i]
				if(arr[j+1]<arr[j]) { // check values
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!swapped) { // if no swaps occured, then no need to continue sorting
				return;
			}
		}
	}
}