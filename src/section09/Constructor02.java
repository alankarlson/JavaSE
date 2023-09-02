package section09;

public class Constructor02 {
	
	public static void main(String[] args) {
		
		// 인자값이 있는 객체 생성하기
		Beer beer1 = new Beer(500, "하이네켄", "캔맥주", 3000);
		Beer beer2 = new Beer(300, "스텔라", "병맥주", 2000);
		
		
		beer1.getInfo();
		System.out.println("=================");
		beer2.getInfo();
		
	}
	
	
	

}
