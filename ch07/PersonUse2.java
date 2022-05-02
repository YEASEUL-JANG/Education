package ch07;

public class PersonUse2 {

	public static void main(String[] args) {
		Person n = new Person();
		n.setName("홍길동");
		n.setAge(30);
		n.setEmail("hong@naver.com");
		n.setAddress("서울 강남구 역삼동");
		System.out.println("이름 : "+n.getName());
		System.out.println("나이 : "+n.getAge());
		System.out.println("이메일 : "+n.getEmail());
		System.out.println("주소 : "+n.getAddress());
		System.out.println();
		
		Person n2 = new Person();
		n2.setName("사임당");
		n2.setAge(23);
		n2.setEmail("saimdang@daum.net");
		n2.setAddress("서울 강남구 개포동");
		System.out.println("이름 : "+n2.getName());
		System.out.println("나이 : "+n2.getAge());
		System.out.println("이메일 : "+n2.getEmail());
		System.out.println("주소 : "+n2.getAddress());
	}

}
