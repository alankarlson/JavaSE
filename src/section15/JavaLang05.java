package section15;
/*
 * StringBuffer
 * 	문자열을 동적으로 다루기 위한 클래스
 * 	Thread safe O (자동 동기화, 멀티스레드 사용 시 이 클래스 써야 함)
 * 
 * StringBuilder 클래스
 * 	문자열을 동적으로 다루기 위한 클래스 
 * Thread safe X (동기화하지 않아 StringBuffer보다 속도가 빠름)
 */

public class JavaLang05 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		
		System.out.println("========StringBuffer========");
		System.out.println(sb);
		System.out.println("sb: " + System.identityHashCode(sb));
		
		System.out.println("============================");
		
		sb.append("def");
		System.out.println(sb);
		System.out.println("sb: " + System.identityHashCode(sb));
		
		System.out.println("========StringBuilder========");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("안녕하세요.");
		System.out.println(sb2);
		System.out.println("sb2: " + System.identityHashCode(sb2));
		
		System.out.println("=============================");
		
		sb.append("Hello, java!");
		System.out.println(sb2);
		System.out.println("sb2: " + System.identityHashCode(sb2));
		
	}

}
