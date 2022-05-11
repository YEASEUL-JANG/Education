package ch13;

public class ExceptionEx {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		try {
			for(int i=0; i<=5;i++) { //i<=5는 에러지만 문법적 오류는 아니기 때문에 디버깅됨
				System.out.println(nums[i]);
			}
		} catch (Exception e) {
		System.out.println("프로그램실행중 문제발생");
		}
		System.out.println("프로그램 종료.");
		}
	}


