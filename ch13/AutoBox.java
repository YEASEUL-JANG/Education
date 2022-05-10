package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//기본자료형 
		int num1 = 10;
		int num2 ;
		
		Integer i1;//객체참조변수(메모리의 주소값을 저장함), 아직은 선언만 했기에 i1의 값은 null상태
		Integer i2 = new Integer(20);//i2는 20이라는 값을 오토박싱처리함(기본자료형 -> 객체로 박스처리 )
		i1=num1;// 기본자료형값을 객체자료형에 넣음(오토박싱처리)
		num2=i2; //객체자료형을 풀어 기본자료형값에 넣음(오토 언박싱)
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
	}
}
