package section05;

public class HomeworkPrac03 {
	public static void main(String[] args) {
		
		//다이아몬드 찍기
		
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
