package section05;

// 숙제완료

public class HomeworkPrac04 {
	public static void main(String[] args) {
		for (int i=0; i < 7; i++) {
			for (int j=0; j < 7; j++) {
				if (i <= 7/2) {
					if (j < 3-i) {
						System.out.print(" ");
					} else if (j > 3+i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}				
				}
				
				else {
					if (j < i-3) {
						System.out.print(" ");			
					} else if (j > 9-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
						}
			}
		}
			System.out.println();
	}
	
	}
}
