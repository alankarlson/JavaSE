package section18;

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		CountThread ct = new CountThread();
		ct.setName("CountThread"); //CountThread 이름지어줌, 로그 확인할때 편리함
		ct.start();
		
		for (int i = 1 ; i < 10; i++) {
			//getName()으로 현재 실행되는 스레드 출력
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i);
			
			try {
				Thread.sleep(500); // 0.5초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("메인스레드 종료!");
		
		
	}

}
