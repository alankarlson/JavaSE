package section10.access1;

public class MiniBike extends Bicycle {
	
	public boolean isMini;
	public int mibike;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("isMini: " + isMini);
	}
	
	public int mibiketest() {
		System.out.println("mibike: " + mibike);
		return mibike;
	}

}
