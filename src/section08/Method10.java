package section08;

/*
 * VO (Value Object), DTO(Data Transfer Object)
 * 	값 오브젝트로서 목적에 맞는 변수의 집합.
 * 	Database 또는 네트워크 통신 간 값 운반용으로 사용된다.
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고
 * 				 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * 
 */


public class Method10 {
	public static void main(String[] args) {
		
		MemberVO memberVO = new MemberVO();
		
		//데이터 입력
		
		memberVO.setId("abc");
		memberVO.setPwd("abc123!@#");
		memberVO.setName("홍길동");
		memberVO.setAge(-17);
		memberVO.setMobile("01012345678");
		
		
		//데이터 가져오기
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		int age = memberVO.getAge();
		String mobile = memberVO.getMobile();
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("mobile: " + mobile);
	}

}
