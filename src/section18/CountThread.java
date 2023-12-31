package section18;

public class CountThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("CountThread 시작!");
		
		for (int i = 1; i < 11; i++) {
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i*100);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("CountThread 종료!");
		
	}

}
