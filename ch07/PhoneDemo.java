package ch07;
class Phone{
String model;
int value;
void print() {
	System.out.println(value +"만원짜리 "+model + "스마트폰");
 }
}
public class PhoneDemo {
	public static void main(String[] args) {
		Phone my = new Phone();
		my.model = "갤럭시 s21";
		my.value = 100;
		my.print();
		
		Phone your = new Phone();
		your.model = "아이폰";
		your.value = 150;
		your.print();
		
	}
}
