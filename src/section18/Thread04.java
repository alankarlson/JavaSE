package section18;

public class Thread04 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		InterThread interThread = new InterThread();
		
		//스레드 객체 생성, 생성시 인터페이스를 넣어 줌
		Thread thread = new Thread(interThread);
		
		thread.start();
		

		System.out.println("메인 스레드 종료!");
		
	}

}
