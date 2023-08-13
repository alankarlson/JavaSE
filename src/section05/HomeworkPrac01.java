package section05;
/*
 * 중첩반복문 별찍기 (1)
 * 
 */
public class HomeworkPrac01 {
	public static void main(String[] args) {
		
		// 별표 54321 찍기
//		for (int i = 0; i < 5; i++) {
//			for (int k = 4; k-i >=0; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 숙제 2번! (반쪽트리)
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 3; j-i >= 0; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		// 숙제 3번 (트리)
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 3; j-i >=0; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i+1; k++) {
//				System.out.print("*");
//			}
//			for (int m = 1; m < i+1; m++) {
//				System.out.print("*");
//			}
//			for (int l = 3; l-i >=0; l--) {
//				System.out.print(" ");
//
//		}
//			System.out.println();
//		}
		
		// 숙제 4번 (다이아몬드)
		
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j-i >=0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			for (int m = 1; m < i+1; m++) {
				System.out.print("*");
			}
			for (int l = 3; l-i >=0; l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int a = 1; a < 4; a++) {
			for (int b = 0;  b < a + 1; b++) {
				System.out.print(" ");
			}
			for (int Intb = 3; Intb - a >= 0; Intb--) {
				System.out.print("*");
			}
			for (int c = 2; c - a >=0; c--) {
				System.out.print("*");
			}			
			System.out.println();

			}	
		
		
		}

	}

