package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		//Calendar인스턴스생성은 new를 만들 수 없음 (추상클래스이므로)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //월은 0부터 시작하므로 +1 해줘야함
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));//12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간제
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//오전=0, 오후=1
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		//1년중 몇번째 날인지?
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월에 몇번째 날?
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//요일(일요일 1 ~ 토요일 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			yoil="일요일";
			break;
		case 2:
			yoil="월요일";
			break;
		case 3:
			yoil="화요일";
			break;
		case 4:
			yoil="수요일";
			break;
		case 5:
			yoil="목요일";
			break;
		case 6:
			yoil="금요일";
			break;
		case 7:
			yoil="토요일";
			break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		
		//1년중 몇번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		//date메소드는 에러는 아니지만 deprecated되었으므로 차츰 쓰지 않게 유도함.
		Date date=cal.getTime();
		System.out.println(date.getYear()+1900);//1900을 더함
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
		
		
		
	}

}
