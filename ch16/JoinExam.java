package ch16;

public class JoinExam {
public static void main(String[] args) {
	MyThread3 thread = new MyThread3();
	thread.start();
	System.out.println("Thread가 종료될 때까지 기다립니다.");
	try {
		thread.join();//메인스레드가 잠시 멈춤, 다른작업이 끝나면 자동으로 깨서 다음을 실행함.
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Thread가 종료되었습니다.");
}
}
