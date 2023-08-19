package section05;

// 구구단 숙제 
public class HomeworkPrac05 {
	public static void main(String[] args) {
		
	for (int k = 0; k < 3; k++){

		for (int i = 0; i < 9; i++) {	
			for (int j = 0; j < 3; j++) {

			int num = j + 2 + (3 * k);
			int mul = i + 1;
			int result =  num * mul;

			if (num < 10) {
			System.out.printf("%d X %d = %d\t", num, mul, result);
			}
			}
			
			System.out.println();
			
		}
	
	}

	}
}
