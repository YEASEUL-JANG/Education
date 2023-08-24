package ch13;

public class WrapperEx3 {

	public static void main(String[] args) {
		char[] ch = {'H','e','l','l','o','1','2','3','4'};
		String str = "";
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				System.out.println(ch[i]+"는 대문자입니다.");
			}else if(Character.isLowerCase(ch[i])) {
					System.out.println(ch[i]+"는 소문자입니다.");
			}else if(Character.isDigit(ch[i])) {
				System.out.println(ch[i]+"는 숫자입니다.");
				str += String.valueOf(ch[i]);
				
			}else {
				System.out.println(ch[i]+"는 기타문자 입니다.");
			}
			
		}//end for
		
		int i = Integer.parseInt(str);
		System.out.println("문자 "+Integer.toString(i)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str)+"입니다.");
		System.out.println("숫자 1234 + 2 = "+(Integer.parseInt(str)+2)+"입니다.");
	}//main
}
