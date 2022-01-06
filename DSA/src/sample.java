class sample {
	static void add() {
		System.out.println("Add Method");
	}
   public static void main(String args[]) {
     int arr[] = new int[2];  
     System.out.println(arr[0]);
     System.out.println(arr[1]);
     sample s = new sample();
     s.add();
   }
}