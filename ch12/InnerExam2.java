package ch12;
public class InnerExam2 {
	static class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}
public static void main(String[] args) {
	InnerExam2.Cal cal = new Cal();
	cal.plus();
	System.out.println(cal.value);
	
}
}
