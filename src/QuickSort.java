
public class QuickSort {

	public static void main(String[] args) {

		int a[] = {2,1,7,6,8,0};
		
		quickSort(a, 0, a.length-1);
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}

	private static void quickSort(int[] a, int left, int right) {
		if(left>=right){
			return;
		}
		
		int pivot = (a[left] + a[right])/2;
		int index = partition(a, left, right, pivot);
		quickSort(a, left, index-1);
		quickSort(a, index, right);
	}

	private static int partition(int[] a, int left, int right, int pivot) {
		while(left <= right){
			while(a[left] < pivot){
				left++;
			}
			while(a[right] > pivot){
				right--;
			}
			if(left<=right){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				
				left++;
				right--;
			}
		}
		return left;
	}

}
