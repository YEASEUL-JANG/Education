package ch14;

public class Type1 {
private int value;

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}
public static void main(String[] args) {
	Type1 t = new Type1();
	t.setValue(100);
	//t.setValue("문자"); 데이터 타입이 바뀌면 변수형을 다 일일이 바꿔야 함.
	System.out.println(t.getValue());
}

}
