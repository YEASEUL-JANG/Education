package ch06;

public class ReturnEx2 {

	public static void main(String[] args) {
		printScore(101);
	}

	static void printScore(int score) {
		if(score <= 0 || score >=100) {
			System.out.println("잘못된 점수 : "+score);
			return; // if문 안에 return이 있으면 여기서 끝남. = break와 같은 역할
		}// return 이 있는 위치가 메소드의 종료시점.
		System.out.println("점수 : "+score);
	}

}
