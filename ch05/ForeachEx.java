package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum은 배열보다 좀 더 간편한 방식으로 단지 데이터를 나열해서 쓰기만하면 됨.
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"사과", "배","바나나", "체리","딸기","포도"};
		int sum = 0;
		
		for(int aa : n) {
			System.out.print(aa+" ");
			sum += aa;
		}
		System.out.println("합은 : "+sum);
		
		for(String ss : names) {
			System.out.print(ss+ " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
	}

}
