package section05;

/*
 * 2. do ~ while 문 ---> 실무에서 잘 안씀
 * 	while문과 비슷하지만, 최소 한 번 실행된다.
 * 
 * 
 *  do {
 *  	반복 실행 코드영역
 * 	} while(조건식);
 *  
 */
public class Loop02 {
	public static void main(String[] args) {
		
		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while (count < 100);
		
	}

}
