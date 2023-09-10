package section17;

import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는 데 사용되는 선언적이고 함수형 스타일의 API이다.
 * 	컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등 효율적이고 간결하게 수행 가능.
 * 
 */
public class Lambda02 { 
	public static void main(String[] args) {
		// List.of 대신 Arrays.asList 로 쓸수도 있음 -> 이렇게쓰면 배열성, 길이변경 안되고 데이터변경은 됨.
		
		//불변리스트 객체, JDK 9부터 지원
		List<String> names = List.of("Apple", "Bat", "Cat", "Dog");
		
//		printBasic(names);
		printWithFP(names);
	}
	
	private static void printBasic(List<String> list) {
		for (String element: list) {
			System.out.println(element);
		}
	}
	
	//람다식으로 더 간결하게 작성
	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(e -> System.out.println("e - " + e));
		
	}
}
