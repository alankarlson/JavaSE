package section11;

import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism05 {
	//속성
	public static void main(String[] args) {
		
		
		SchoolBus sb1 = new SchoolBus();
		sb1.drive();	
					
		System.out.println("================");
	
		Car car1 = sb1;
		car1.drive();
		
		System.out.println("================");
		
		System.out.println("sb1: " + sb1);
		System.out.println("car1: " + car1);
		
		System.out.println("================");
		
		sb1.stopPannel();
//		car1.stopPannel();	// 문법상 오류, 컴파일에러 발생
		
		System.out.println("================");
		
		SchoolBus sb2 = (SchoolBus)car1; // 부모객체 => 자식객체 대입 시 형변환 필요!
		sb2.stopPannel();
		System.out.println("sb2: " + sb2);
	
	}
}
