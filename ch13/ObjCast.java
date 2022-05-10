package ch13;

public class ObjCast {

	public static void main(String[] args) {
		int a =10;
		//부모 : 자식 
		Object obj = 20;
		a=(Integer)obj;//형변환(obj가 객체여서 int보단 Integer가 맞음)
		System.out.println(a);
		
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object 객체(Integer, Double, Boolean 등)가 되어버림 => 오토박싱
		//메모리 낭비가 심하다.
		for(Object o : obj2) {
			System.out.println(o); //오토언박싱처리
		}
	}

}
