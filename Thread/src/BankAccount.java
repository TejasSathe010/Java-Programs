
public class BankAccount {

	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	public void withDraw(int amt) {
		balance = balance - amt;
	}
}
