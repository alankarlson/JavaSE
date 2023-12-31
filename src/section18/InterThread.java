package section18;

//Runnable 인터페이스 상속받아서 run 구현
public class InterThread implements Runnable {

	@Override
	public void run() {
		System.out.println("InterThread 시작!");
										
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread 종료!");
		
	}

}
