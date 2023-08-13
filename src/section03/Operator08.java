package section03;
/*
 * 8. 삼항 연산자
 * 
 * 	조건식 ? 조건식이 참일 경우 반환 : 조건식이 거짓일 경우 반환
 * 
 * 
 */

public class Operator08 {
	public static void main(String[] args) {
		
		int num = 10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		
		System.out.println(result);
		
		int num2 = 4;
		String result2 = num2 > 4 ? "num은 4보다 크다" : "num은 4보다 작다";
		System.out.println(result2);
		
		String result3 = "";
		if (num > 0 ) {
			result3 = "num은 양수";
		} else {
			result3 = "num은 음수";
		}
		System.out.println(result3);
		
		
		int x = 8;
		int y = 12;
		
		int max = (x > y) ? x : y; //x와 y중 큰 값을 선택
		System.out.println("두 수 중 큰 값은: " + max);
		
		//삼항연산자 중첩 사용하기
		
		int a = 5;
		int b = 3;
		int c = 7;
		int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("세 수 중 가장 큰 값은: " + largest);
	}

}
