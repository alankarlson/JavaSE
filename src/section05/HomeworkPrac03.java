package section05;

public class HomeworkPrac03 {
	public static void main(String[] args) {
		
		//다이아몬드 찍기(간략화)
		// i가 0부터 시작하는 거 아닐때는 (i%시작하는숫자)로 해줘야 0, 1, 2... 되는듯?
		// for문이 최대한 적게 쓰여야 좋음
		
		for (int i = 0; i < 7; i++) {
			
			if (i < 3) {
				for (int j = 2; j - i >= 0; j--) {
					System.out.print(" ");		
				}
			}
			if (i > 3) {
				for (int l = 0; l < (i%4)+1; l++) {
					System.out.print(" ");
				}
			}		
			
			if (i < 7) {
				if (i < 4) {
					for (int k = 0; k < (2*i)+1; k++) {
					System.out.print("*");
				}
				}
				else if (i >= 4) {
					for (int m = 4; m-2*(i%4) >= 0; m--) {
						System.out.print("*");
					}
					}
				}
				
			System.out.println();
			
		} 
			
	}

}
