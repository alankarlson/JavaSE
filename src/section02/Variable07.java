package section02;
/*
 * 형변환(cast)
 * 	1. 업캐스팅(프로모션)
 * 		- 표현 범위가 더 큰 데이터형으로 변환하기
 * 		- 자동으로 가능
 * 		- 데이터 손실이 없다
 * 	1. 다운캐스팅(디모션)
 * 		- 표현 범위가 더 작은 데이터형으로 변환하기
 * 		- 명시적으로 형변환 해야한다.
 * 		- 데이터 손실이 있을 수 있다. 
 * test
 */
public class Variable07 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte;	// 자동으로 형변환
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		System.out.println("iDouble: " + iDouble);
		
		// 다운캐스팅 - overflow 주의해야 함
		int iInt2 = 130; // 128 : -128, 129: -127, 130: -126... 오버플로우 현상으로 차이 생김
		byte iByte2 = (byte)iInt2; // 다운캐스팅이므로 변환하고싶은 타입을 명시해야 함
		System.out.println("iByte2: " + iByte2);
		
		// 실수 -> 정수 형변환 예, 
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; // 소수점 뒷자리 날리고 싶을때 이런식으로 함
		System.out.println("iInt3: " + iInt3);
		
		//내연습 (double -> float) 
		double iDouble2 = 10.24444;
		float iFloat3 = (float)iDouble2;
		System.out.println("IFloat3: " + iFloat3);

		
	}

}
