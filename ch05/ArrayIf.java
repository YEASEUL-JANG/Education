package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		if(arr!=null) { //arr은 주소값이 저장되기 때문에
			for(int ss : arr) {
				System.out.println(ss);
			}
		}
	}

}
