import java.util.Scanner;

public class LinearSearch {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80};
		sc = new Scanner(System.in);
		int item,flag=0;
		System.out.println("Enter the item which you want to search");  
		item = sc.nextInt();  
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == item) {
				flag = i+1;
				break;
			}else {  
				flag = 0;
			}
		}
		if(flag > 0) {
			System.out.println("the location of the item is "+ (flag));  

		}else {
			System.out.println("the location of the item not found");  
		}
	}
}


