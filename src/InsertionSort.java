
public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {3,2,6,5};
		
		for(int i=0; i<a.length; i++){
			int j = i-1;
			int key = a[i];
			
			while(j>=0 && key<a[j]){
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
			j--;
			
				
			
		}
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}
