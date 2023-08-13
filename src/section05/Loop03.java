package section05;

/*
 * 3. for 문 ---> 제일 많이 씀 
 * 	for : 조건이 명확할 때 많이 씀 / while : 무한루프로 돌다가 특정 시점에 멈춰야 할 때 많이 씀
 * 	초기식, 조건식, 증감식을 이용하여 반복하는 명령어
 * 
 * for(초기식; 조건식; 증감식) {
 * 		반복 수행할 코드 영역
 * }
 * 
 *
 */

public class Loop03 {
	public static void main(String[] args) {
		// for문을 이용하여 0~99까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}
		
	
		int i = 0;
		while (i < 100) {
			System.out.println(i);
			i++;
		}
		
	}

}
