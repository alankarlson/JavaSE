package section10.access1;

public class MountainBike extends Bicycle {
	
	public boolean isSuspension;
	
	@Override  // 어노테이션
	public void getInfo() {
		super.getInfo();	// 부모 getInfo() 호출
		System.out.println("isSuspension: " + isSuspension);
	}
	
	

}
