package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

//두개이상 예외 발생시 - 세부적인 예외부터 처리함
//ArithmeticException
//InputMismatchException
public class DoubleExam {

	public static void main(String[] args) {
		int num = 50;
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("숫자를 입력하세요 : ");
			int value = in.nextInt();
			System.out.println(num/value);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		} catch (NullPointerException e) {
			System.out.println("널값예외");
		} catch (Exception e) {
			System.out.println("기타예외");
		} finally {//옵션: 예외발생 여부 관계없이 항상 실행되는 코드(필수사항은 아님)
			if(in != null) {
				in.close();
			}
		}
		System.out.println("종료");

	}

}
