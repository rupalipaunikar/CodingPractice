
public class MergeSort {

	public static void main(String[] args) {
		int a[] = {2,1,7,6,8,0};
		
		mergeSort(a, new int[a.length], 0, a.length-1);
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}

	private static void mergeSort(int[] a, int[] temp, int leftStart, int rightEnd) {
		if(leftStart >= rightEnd){
			return;
		}
		
		int middle = (leftStart+rightEnd)/2;
		mergeSort(a, temp, leftStart, middle);
		mergeSort(a, temp, middle+1, rightEnd);
		mergeHalves(a, temp, leftStart, rightEnd);
	}

	private static void mergeHalves(int[] a, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd)/2;
		int rightStart = leftEnd +1;
		int size = rightEnd - leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd){
			if(a[left] < a[right]){
				temp[index] = a[left];
				left++;
			}
			else{
				temp[index] = a[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(a, left, temp, index, leftEnd - left+1);
		System.arraycopy(a, right, temp, index, rightEnd - right+1);
		System.arraycopy(temp, leftStart, a, leftStart, size);
	}

}
