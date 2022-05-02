package ch07;

public class Person {
	private String name;
	private int age;
	private double height;
	private String email;
	private String address;
	
	
	//setter : set +변수명
	public void setName(String name) { //name은 지역변수
		//this => 멤버변수를 가리킴.
		this.name = name;
	}
	public String getName() { //name은 지역변수
		//this => 멤버변수를 가리킴.
		return name;
	}
	
	public void setHeight(double height) { //name은 지역변수
		this.height = height;
	}
	public double getHeight() { 
		return height;
	}
	
	public void setAge(int age) { //name은 지역변수
		if(age<0 || age >150) {
			System.out.println("입력값이 정확하지 않습니다.");
		} else {
			this.age = age;
		}
	}
	public int getAge() { 
		return age;
	}
	public void setAddress(String address) { //name은 지역변수
		//this => 멤버변수를 가리킴.
		this.address = address;
	}
	public String getAddress() { //name은 지역변수
		//this => 멤버변수를 가리킴.
		return address;
	}
	public void setEmail(String email) { //name은 지역변수
		//this => 멤버변수를 가리킴.
		this.email = email;
	}
	public String getEmail() { //name은 지역변수
		//this => 멤버변수를 가리킴.
		return email;
	}
}
