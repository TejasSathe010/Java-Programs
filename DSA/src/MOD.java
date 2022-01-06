
public class MOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rear = -1 , capacity = 5, cnt = 0;
		while(cnt != 5) {
			rear = (rear + 1)%capacity;
			System.out.println(rear);
			cnt ++;
		}
		System.out.println();
		System.out.println();

		System.out.println((2+1)%5);

	}
}
