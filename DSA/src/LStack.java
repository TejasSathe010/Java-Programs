
public class LStack {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	boolean isFull() {
		return (top >= (MAX - 1));
	}

	LStack(){
		top = -1;
	}

	boolean push(int x) {
		if(isFull()) {
			System.out.println("OverFlow..");
			return false;
		}else {
			a[++top] = x;
			System.out.println("Pushed..");
			return true;
		}
	}

	int pop() {
		if(isEmpty()) {
			System.out.println("Underflow..");
			return -1;
		}else {
			int x = a[top--];
			System.out.println("Poped..");
			return x;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LStack s = new LStack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.pop() + " Popped from stack"); 
		System.out.println(s.pop() + " Popped from stack"); 
		System.out.println(s.pop() + " Popped from stack"); 

	}
}
