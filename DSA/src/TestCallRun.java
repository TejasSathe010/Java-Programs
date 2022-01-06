class TestCallRun implements Runnable{ 
	public void run(){ 
		if(Thread.currentThread().getName().equals("Thread1")) {
			myThread(5);
		}else {
			myThread(0);
		}
	}  
	private void myThread(int m) {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++){  
			try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			System.out.println(i + m + "  " +Thread.currentThread().getName());
		}

	}
	public static void main(String args[]){  
		TestCallRun t1=new TestCallRun();  
		//TestCallRun t2=new TestCallRun();

		Thread T1 = new Thread(t1);
		T1.setName("Thread1");
		Thread T2 = new Thread(t1);
		T2.setName("Thread2");
		System.out.println(T1.getName() + "  " + T1.getPriority());  
		System.out.println(T2.getName() + "  " + T2.getPriority());
		T2.setPriority(Thread.MAX_PRIORITY);
		T1.setPriority(Thread.MIN_PRIORITY);


		T1.start();
//		try {
//			T1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		T2.start();
	}  
}