package section13;

public class OuterClass03 {
	public static void main(String[] args) {
		OuterClass03 outer = new OuterClass03();
		OuterClass03.InnerClass inner = outer.new InnerClass();
		inner.info();
		
	}

	public class InnerClass {
		public void info() {
			System.out.println("인스턴스내부클래스 안의 일반메서드 info()입니다.");
		}
	}
}
