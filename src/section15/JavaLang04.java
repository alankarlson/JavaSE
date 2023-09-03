package section15;

public class JavaLang04 {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "abc";
		String str3 = new String("abc"); //실무에서는 거의 문자열 이런식으로 넘어옴
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2) {
			System.out.println("str1 == str2 true");
		} else {
			System.out.println("str1 == str2 false");
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3 true");
		} else {
			System.out.println("str1 == str3 false");
		}
		
		//string에서 값 비교는 equals() 메서드 사용해야 함.
		//문자열 값 자체를 비교, 문자열 같으면 true

		if(str1 != null && str1.equals(str3)) {
			System.out.println("str1.equals(str3) true");
		} else {
			System.out.println("str1.equals(str3) false");
		}
		
		
	}

}
