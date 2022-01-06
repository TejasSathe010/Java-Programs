class Stack2 {
  int stck[] = new int[10];
  int tos;
  // Initialize top-of-stack
  Stack2() {
tos = -1; }
  // Push an item onto the stack
  void push(int item) {
    if(tos==9)
      System.out.println("Stack is full.");
    else
      stck[++tos] = item;
}
  // Pop an item from the stack
  int pop() {
    if(tos < 0) {
       System.out.println("Stack underflow.");
       return 0;
} else
      return stck[tos--];
  }
}


class Stack{
	public static void main(String[] args) {
		Stack2 S = new Stack2();
		S.push(5);
		S.push(6);
		S.push(7);
		S.push(8);
		S.push(9);
		S.push(10);
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());
		System.out.println(S.pop());


	}
}