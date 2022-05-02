package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("김철수");
		p.setAge(20);
		p.setHeight(180);
		System.out.println("이름 : "+p.getName());
		System.out.println("나이 : "+p.getAge());
		System.out.println("키 : "+p.getHeight());
	}

}
