
public class RyanAndMonicaJob implements Runnable{
	BankAccount BA = new BankAccount();
	private int balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		
		one.start();
		two.start();
		
	}
	
	public void run() {
		for(int x = 0; x < 5; x++) {
			makeWithDraw1(10);
			if(BA.getBalance() < 0) {
				System.out.println("OverDrawn!");
			}
		}
	}
	
	//private synchronized increament() {
	//	int i = balance;
	//	balance = i + 1;
	//}
	
	private synchronized void makeWithDraw1(int amt1) {
		if(BA.getBalance() >= amt1) {
			System.out.println(Thread.currentThread().getName() + " Is About To WithDraw Money..");
			try {
				System.out.println(Thread.currentThread().getName() + " Is Going To Sleep..");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Is Woke Up..");
			BA.withDraw(amt1);
			System.out.println(Thread.currentThread().getName() + " Completed Transaction..");
		}
		else {
			System.out.println(" Sorry Not Enough for " + Thread.currentThread().getName());

		}
	}

}
