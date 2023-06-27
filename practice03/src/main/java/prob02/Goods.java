package prob02;

public class Goods {
	private String prodName;
	private int price;
	private int stock;
	
	public Goods(String prodName, int price, int stock) {
		this.prodName = prodName;
		this.price = price;
		this.stock = stock;
	}
	
	public void show() {
		System.out.printf("%s(가격: %d원)이 %d개 입고 되었습니다.\n", prodName, price, stock);
	}
}
