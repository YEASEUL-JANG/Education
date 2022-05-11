package ch13;

import java.util.Calendar;
import java.util.Scanner;

public class JuminEx {
public static void main(String[] args) {
	String jumin="", gender="", weather="";
	Calendar cal = Calendar.getInstance();
	Scanner scan = new Scanner(System.in);
	System.out.print("주민등록번호를 입력하시오 (- 포함) :");
	jumin = scan.next();
	int age = Integer.valueOf(jumin.substring(0,2));
	
	char s = jumin.charAt(7);
	//성별 (1,3: 남자, 2,4:여자)
	if(s== '1'||s=='3') {
		gender = "남";
	}else if(s== '2'||s=='4') {
		gender = "여";
	}else {
		gender = "외국인";
	}
	//나이구하기
	if(s=='1'||s=='2'){
			age = (cal.get(Calendar.YEAR)-(1900+age)+1);
}else if(s=='3'||s=='4') {
	 age = (cal.get(Calendar.YEAR)-(2000+age)+1);
}
	
	//계절구하기
	
	String w = jumin.substring(2,4);
	switch (w) {
	case "12":
	case "01":	
	case "02":
		weather = "겨울";
		break;
	case "03":
	case "04":	
	case "05":
		weather = "봄";
		break;
	case "06":
	case "07":	
	case "08":
		weather = "여름";
		break;
	case "09":
	case "10":	
	case "11":
		weather = "가을";
		break;
	}
	System.out.println("주민등록번호 : "+jumin);
	System.out.println("성별 : "+gender);
	System.out.println("나이 : "+age);
	System.out.println("태어난계절 : "+weather);
}
}
