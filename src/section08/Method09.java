package section08;

public class Method09 {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 98};
		
		for (int value : values) {
			System.out.println(value);
		}
		
		System.out.println("====================");
	
		refTest(values);
		
		for (int value : values) {
			System.out.println(value);
		}
		
	}
	
	// 참조형 변수는 값이 바뀌면 원래 값도 영향을 받는다.
	
	public static void refTest(int[] values) {
		values[2] = 100;
	}

}
