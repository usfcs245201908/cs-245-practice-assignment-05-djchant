public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		quick(a, 0, a.length - 1);
	}

	public void quick(int[] a, int left, int right) {
		if(left < right) {
			int p = partition(a, left, right);
			quick(a, left, p - 1);
			quick(a, p + 1, right);
		}
	}

	public int partition(int[] a, int left, int right) {
		int pivot = a[right];
    	int i = (left - 1);
 
	    for (int j = left; j < right; j++) {
	        if (a[j] <= pivot) {
	            i++;
	 			swap(a, i, j);
	        }
	    }
 	
 		swap(a, i + 1, right);
   		return i + 1;
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}