package ch13;

public class StrBuildEx {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer();
		str1.append("I am a");
		String str2 = " Java Programmer";
		
		str1.append(str2);
		
		System.out.println("--------------------------------------------");
		System.out.println("append()메소드를 활용 : "+str1.toString());
		
		str1.replace(7, 12, "JSP ");
		System.out.println("replace()를 활용 : "+str1.toString());
		
		str2 = str1.substring(7);
		System.out.println("substring()을 활용 : " +str2);
		System.out.println("--------------------------------------------");
	}

}
