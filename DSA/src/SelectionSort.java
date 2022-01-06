
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 1, 3, 9, 6};
		int[] Sarr = Selection(arr);
		for( int i =0 ; i < Sarr.length; i++) {
			System.out.println(Sarr[i]);
		}

	}

	private static int[] Selection(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, minValue, minIndex, temp;
		for( i = 0; i < arr.length; i++) {
			minValue = arr[i];
			minIndex = i;
			for( j = i; j < arr.length; j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;	
				}
			}
			if(minValue < arr[i]) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}



//Time Complexity : O(n^2)
