package section05;

/*
 * 중첩 반복문
 * 	반복문 안에 반복문 또 사용 
 * 
 * 
 */
public class Loop04 {
	public static void main(String[] args) {
		int num = 0;
		
//		System.out.println("i/j0123456");
		
		for(int i = 0; i < 7; i++) {

			for(int j = 0; j < i+1; j++) {
				/*
				 * i:0 - j: 0 (1번)
				 * i:1 - j: 0, 1,(2번...)
				 * .
				 * .
				 * .
				 * i:6 - j: 0, 1, 2, 3, 4, 5, 6 (7번)
				 */
				
				System.out.print("*");
				
//				System.out.println((i*7) + j + 1);
//				System.out.println("i: " + i + " " + "j: " + j);
//				num++;
			}
																		
			System.out.println(); // 개행
		}
		
	}

}
