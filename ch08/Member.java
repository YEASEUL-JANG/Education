package ch08;

public class Member {
	private String id;
	private String name;
	private int money;
	private String grade;
	
	public Member() {
	}

	public Member(String id, String name, int money) {
		this.id = id;
		this.name = name;
		this.money = money;
		if(money >= 100000) {
			grade = "gold";
		}else if(money >= 50000) {
			grade = "silver";
		}else {
			grade = "bronze";
		}
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+money+"\t"+grade);
	}
}
