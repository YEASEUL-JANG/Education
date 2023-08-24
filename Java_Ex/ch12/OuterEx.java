package ch12;

public class OuterEx {
	class InnerEx{
		private int num = 2;
		private String name = "사임당";
	}//end InnerEx
	
	void Innermethod() {
		class InnerEx3{
			String play2() {
				return "saim@gmail.com";
			}
		}
		InnerEx3 a = new InnerEx3();
		String email = a.play2();
		System.out.println("이메일 : "+email);
	}
	static class InnerEx2{
		static String add = "서울시 강남구 역삼동";
	}
	
	public static void main(String[] args) {
		OuterEx ou = new OuterEx();
		OuterEx.InnerEx in = ou.new InnerEx();
		
		System.out.println("--------------------------------------");
		System.out.println("고객번호 : "+in.num);
		System.out.println("이름 : "+in.name);
		ou.Innermethod();
		System.out.println("주소 :" +OuterEx.InnerEx2.add);
		System.out.println("--------------------------------------");
	}

}
