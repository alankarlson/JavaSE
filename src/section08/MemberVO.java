package section08;

/*
 * this - 자기 자신을 가리키는 참조키워드 
 * 
 */

public class MemberVO {
	
	//private - 자기 자신 클래스에서만 접근 가능한 접근제한자
	//접근제한자로 변수에 직접 접근하는 걸 막을 수 있음
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String mobile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		//전역변수에 있는 id 가리킬 때 this 씀
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		//데이터 전처리
		if (age <= 0) {
			System.out.println("잘못된 수를 입력하였습니다. ");
			return; // 메서드 종료			
		}
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
