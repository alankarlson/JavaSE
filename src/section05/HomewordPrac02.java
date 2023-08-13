package section05;
/*
 * 마지막 두개가 드럽게 안찍혀서 테스트 해본거
 * 
 */

public class HomewordPrac02 {
	public static void main(String[] args) {
		for (int c = 0; c < 2; c++) {
			for (int d = 1; d - c >= 0; d--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
