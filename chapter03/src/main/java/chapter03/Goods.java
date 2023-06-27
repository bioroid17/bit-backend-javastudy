package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int countOfGoods = 0;
	
	public Goods() {
		// 생성자
//		Goods.countOfGoods = Goods.countOfGoods + 1;	// 이것도 가능하지만, 클래스 내에서는 클래스 명 생략 가능
		countOfGoods = countOfGoods + 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("재고:" + countStock);
		System.out.println("판매량:" + countSold);
	}

	public int calcDiscountPrice(double discountRate) {
		return (int)(price * discountRate);
	}
}
