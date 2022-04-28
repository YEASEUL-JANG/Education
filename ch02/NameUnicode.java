package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char jang = '\uC7A5';
		char yea = '\uC608';
		char seul = '\uC2AC';
		String name = "장 예 슬";
		System.out.println("=====================");
		System.out.println(name);
		System.out.println("---------------------");
		System.out.println("char형('\\uC7A5') : " +jang);
		System.out.println("char형('\\uC608') : " +yea);
		System.out.println("char형('\\uC2AC') : " +seul);
		System.out.println("=====================");
		
	}

}
