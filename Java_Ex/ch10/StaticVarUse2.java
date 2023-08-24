package ch10;

public class StaticVarUse2 {
public static void main(String[] args) {
	System.out.println(StaticVar2.total);

	StaticVar2 car1 = new StaticVar2("쏘나타");
	System.out.println(car1.model);
	System.out.println(StaticVar2.total);
	
	StaticVar2 car2 = new StaticVar2("모닝");
	System.out.println(car2.model);
	System.out.println(StaticVar2.total);
	
	StaticVar2 car3 = new StaticVar2("아반떼");
	System.out.println(car3.model);
	System.out.println(StaticVar2.total);
}
}
