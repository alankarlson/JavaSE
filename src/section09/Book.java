package section09;

public class Book {
	String title;
	int price;
	int totalPage;
	String author;
	
	// 생성자 - 객체 생성 시 실행
	// this - 자기 자신 참조 키워드
	
	public Book() {
		// 멤버 초기화
		this.title = "멘토시리즈 자바";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "김영우";
		
		// 객체 생성될때 실행되어야 할 게 있으면 생성자에 일반 코드를 넣어도 됨,
		// 주로 변수초기화-멤버초기화 용으로 많이 사용
		
	}
	
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
		System.out.println("title: " + title);	
		}

}
