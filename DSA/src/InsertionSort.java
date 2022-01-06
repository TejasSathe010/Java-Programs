
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 8, 1, 3, 9, 6};
		int[] Sarr = Insertion(arr);
		for( int i =0 ; i < Sarr.length; i++) {
			System.out.println(Sarr[i]);
		}
	}

	private static int[] Insertion(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, key, temp;
		/*for( i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while(j >= 0 && key < arr[j] ) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}	
		}*/
		for( i = 1; i < arr.length; i++) {
			key = arr[i];
			for( j = i - 1; j >= 0; j--) {
				if(key < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}


//Time Complexity : O(n^2)
