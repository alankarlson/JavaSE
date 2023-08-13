package section04;

/*
 * 2. switch ~ case 문
 * 	주어진 변수 값에 따라 여러 case로 분기 실행명령어
 * 
 */

/* Scanner에서 char 변수 받는 법
 * 
* (1)String s = scann.next();
	char c = s.charAt(0);

  (2)
	char c = scan.next().charAt(0);

 */

import java.util.Scanner;

public class Conditional04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		(1) 스트링으로 받아서 캐릭터 하나 꺼내오는 방법...		
//		String key = scan.next();
//		char Charkey = key.charAt(0);
		
		System.out.println("key를 입력하세요 >>>>>");
		
		char key = scan.next().charAt(0);
	
		switch (key) {
		case 'w' :
			System.out.println("앞으로 이동");
			break;
		case 'a' :
			System.out.println("좌측으로 이동");
			break;
		case 's' :
			System.out.println("뒤로 이동");
			break;
		case 'd' : 
			System.out.println("우측으로 이동");
			break;
		default :
			System.out.println("Hold!");
			break;
		}
	}

}
