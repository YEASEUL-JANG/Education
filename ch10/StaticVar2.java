package ch10;

public class StaticVar2 {
	static int total;
	String model;
	public StaticVar2() {}
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
	
}
