package section13;
/*
 * 내부 클래스(Inner Class)
 * 	내부 클래스는 클래스 안에 만들어진 또 다른 클래스(중첩클래스)이다.
 * 	외부클래스와  밀접한 관계를 가진다.
 * 
 * 내부클래스 컴파일
 * 	Outer$Inner.class
 * 	내부클래스 역시 외부클래스 안에 생성되는 것 외에 별도의 클래스이기에
 * 	컴파일시 별도로 생성됨.
 * 
 * 
 */
public class OuterClass01 {
	
	public static void main(String[] args) {
		// 정적내부클래스 - 객체 생성없이 외부클래스를 통해 접근할 수 있다.
		OuterClass01.InnerClass.info();
		
		// 같은 클래스 안에서는 외부클래스 없이 접근 가능하다.
		InnerClass.info();
		
	}
	
	static class InnerClass {
		public static void info() {
			System.out.println("static 내부클래스입니다.");
		}
	}

}
