package ch11;

public class CoinDemo implements Coin{
   // implements Coin 써도되고 안써도 됨 (상수쓸때)
	public static void main(String[] args) {
		// 인터페이스의 상수는 static 영역에 있기때문에 클래스이름.상수이름으로 접근가능
		System.out.println("Dime 은"+ Coin.DIME+"센트입니다.");
		

	}

}
