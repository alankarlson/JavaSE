		package section05;
/*
 * 마지막 두개가 드럽게 안찍혀서 테스트 해본거
 * 
 */

public class HomewordPrac02 {
	public static void main(String[] args) {
		
		
//		for (int c = 0; c < 2; c++) {
//			for (int d = 1; d - c >= 0; d--) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
		
		// 숙제 2 (트리) 조건으로 연습
		
		for (int i = 0; i < 4; i++) {
			
			if (4 - i > 1) {
				for (int j = 2; j - i >=0; j--) {
					System.out.print(" ");		
				}
			}
			
			if (i < 4) {
				for (int k = 0; k < i + 1; k++) {
					System.out.print("*");
				}
				
			}
			if (i > 0) {
				for (int l = 1; l < i+1; l++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		} // 여기까지 트리 완성 
		

		
	}

}
