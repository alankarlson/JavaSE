package section15;

import java.util.Random;

public class JavaUtil02 {
	public static void main(String[] args) {
		
		// int 45 크기의 배열 생성
		int[] lNum = new int[45];
		
		// 각 배열에 1부터 45까지 저장
		for (int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		
		Random ran = new Random();
		
		for (int i = 0; i < lNum.length; i++) {
			// 0~44 숫자 중 임의 값 반환
			int changeIndex = ran.nextInt(45);
			
			// 임시변수 tmp로 두개 값 스왑
			
			/*changeIndex값은 랜덤이니까 중복될 수도 있음, 
			 * 만약 i=0, i=1일때 두 번 연속으로 21이 나오더라도 i=1일때 1Num[21]값은 i=0값과 이미 교환된 상태이므로
			 * 최종값은 중복 없음
			 */
			
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
		}
		
		for (int i = 0; i < 45; i++) {
			System.out.println(lNum[i]+ "/");
			
		}
	}

}
