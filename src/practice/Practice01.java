package practice;
/*
 * 연습 깔짝깔짝 하는 클라스
 * 
 */

// 자바 유틸에서~~~ 스캐너를 가져올 것이다~~~~

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
	
		// Scanner 가져와서 이름, 주소, 나이, 체중 입력받은 뒤 출력
		
		Scanner scan = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 입력하세요.");
		
		name = scan.next();
		address = scan.next();
		age = scan.nextInt();
		weight = scan.nextDouble();
		
		System.out.printf("반가워요 %s님!\n", name);
		System.out.printf("%s에 사시는군요?\n", address);
		System.out.printf("%d살이시라고요?\n", age);
		System.out.printf("몸무게가 %.1fkg이라고요? 그걸 왜 말씀하시는...? 일단 알겠습니다.\n", weight);
		
	
		
	}

}
