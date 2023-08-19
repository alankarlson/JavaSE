package section05;

public class HomeworkAnswer {
	
	public static void main(String[] args) {

//		for(int i = 0; i < 7; i++) {
//			for(int j = 0; j < 7; j++) {
//				if(i <= 7/2) {
//					if(j < 3 - i) {
//						System.out.print(" ");
//					} else if (j > 3 + i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				} else {
//					if(j < i - 3) {
//						System.out.print(" ");
//					} else if (j > 9 - i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println();	// 개행
//		}

		System.out.println("   ☆");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7; j++) {
				if(j < 3 - i) {
					System.out.print(" ");
				} else if (j > 3 + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();	// 개행
		}
		System.out.println("  | | Merry Christmas ~*");
	

}

}
