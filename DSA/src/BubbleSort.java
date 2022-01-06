public class BubbleSort {  
	public static void main(String[] args) {  
		int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		for(int i = 0;i < a.length - 1;i++)  
		{  
			for (int j = 0;j < a.length - 1 - i ; j++)  
			{  
				if(a[j] > a[j+1])  
				{  
					int temp = a[j];
					a[j]=a[j+1];  
					a[j+1] = temp;   
				}  
			}  
		}  
		System.out.println("Printing Sorted List ...");  
		for(int i=0;i<10;i++)  
		{  
			System.out.println(a[i]);  
		}  
	}  
}  