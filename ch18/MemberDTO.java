package ch18;

import java.io.Serializable;
//객체 직렬화를 하려면 Serializable를 구현
//객체 직렬화는 메모리 저장된 객체를 파일로 저장하거나 네트워크를 통해 전송할 수 있음
//mvc패턴 (model view controller)에서 쓰이는 용어
//1)DTO : Data Transfer Object(데이터를 전달하는 객체, 결과물을 저장)
//2) VO : value object, dto의 개념이지만 생성자없이 getter, setter로만 구성됨
//3)DAO : Data AccessObject 데이터 조작 객체, db와 프로그램을 연결하여 데이터를 구하는 비즈니스로직단
public class MemberDTO implements Serializable{
private String userid;
private String name;
private String passwd;
private int age;
private String email;

@Override
public String toString() {
	return "MemberDTO [userid=" + userid + ", name=" + name + ", passwd=" + passwd + ", age=" + age + ", email=" + email
			+ "]";
}
public MemberDTO() {
}
public MemberDTO(String userid, String name, String passwd, int age, String email) {
	super();
	this.userid = userid;
	this.name = name;
	this.passwd = passwd;
	this.age = age;
	this.email = email;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	
}
