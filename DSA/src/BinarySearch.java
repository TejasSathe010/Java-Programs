import java.util.Scanner;

public class BinarySearch {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 19, 20, 23, 44, 45, 56, 78, 90, 96, 100};  
		int item, location = -1;  
		System.out.println("Enter the item which you want to search");  
		sc = new Scanner(System.in);  
		item = sc.nextInt();  
		location = binarySearch(arr,0,9,item);  
		if(location != -1)  
			System.out.println("the location of the item is "+location);  
		else   
			System.out.println("Item not found");  
	}

	private static int binarySearch(int[] arr, int beg, int end, int item) {
		// TODO Auto-generated method stub
		while(end >= beg) {
			int mid = (end + beg)/2;
			if(arr[mid] == item) {
				return mid + 1;
			}else if(arr[mid] < item) {
				beg = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}  
}
