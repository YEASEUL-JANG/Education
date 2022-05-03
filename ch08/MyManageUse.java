package ch08;

public class MyManageUse {

	public static void main(String[] args) {
		MyManager mgrobj = MyManager.getInstance();
		System.out.println("mgrobj.getScore() : "+ mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+ mgrobj.getScore());
		MyManager newMgr = MyManager.getInstance(); // 두번째 싱글톤 호출이기 때문에 처음 mgr주소값만 리턴받아와 new Mgr에 초기화
		System.out.println("newobj.getScore() : "+ mgrobj.getScore());
		
	}

}
