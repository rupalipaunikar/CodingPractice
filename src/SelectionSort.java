
public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {3,2,6,5};
		
		int minIndex = 0;
		
		for(int i=0; i<a.length; i++){
			minIndex = i;
			
			for(int j=i+1; j<a.length; j++){
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			
		}
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}
