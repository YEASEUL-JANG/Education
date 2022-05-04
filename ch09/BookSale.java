package ch09;

public class BookSale extends Book{
	private int amount;
	private int rank;
	private int money;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
//	public int getMoney() {
//		return money;
//	}
	public void setMoney() {
		money = getPrice()*amount;
		if(money>100000) {
			money = (int)(money*0.9);
		}
	}
	public void print() {
		System.out.println("도서명\t출판사\t저자\t출판연도\t단가\t수량\t금액\t판매순위");
		System.out.println(getBookName()+"\t"+getPress()+"\t"+getAuthor()+"\t"+getYear()+
				"\t"+getPrice()+"\t"+amount+"\t"+money+"\t"+rank);
		
	}
	
}
