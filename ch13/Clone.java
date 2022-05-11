package ch13;
//인스턴스 복제하려면 Cloneable이라는 인터페이스를 상속해야한다.
public class Clone implements Cloneable {
	int num=10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone c = new Clone();
		Clone c1 = null;
		try {//예외발생 가능성의 코드처리
			//좌변(Clone) 자식 : 우변(Object) 부모
			c1=(Clone)c.clone(); //인스턴스를 복제함. clone()은 Object의 메소드이기 때문에 좌,우변을 맞추기 위해 객체타입(Clone)으로 형변환 해줘야함.
			
		} catch (CloneNotSupportedException e) {//예외 발생
			e.printStackTrace(); //개발자를 위한 디버깅 정보제공
		}
		System.out.println(c);
		System.out.println(c1);
		c.print();
		c1.print();
	}

}
