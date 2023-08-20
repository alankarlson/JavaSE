package section09;

public class Constructor04 {
	
	// 초기화블럭은 객체 생성 시 무조건 실행됨
	
	{
		System.out.println("Constructor04() 초기화블럭입니다.");
	}
	
	// 객체 생성 시 제일 먼저 실행
	static {
		System.out.println("static 초기화블럭입니다.");
	}
	
	public Constructor04() {
		System.out.println("Constructor04() 생성자입니다.");
	}
	
	public static void main(String[] args) {
		
		Constructor04 con04 = new Constructor04();
		
		
	}

}
