package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.3f;
	
	public int getDiscountPrice() {
		// price는 protected
		return (int) (price * discountRate);
	}
}
