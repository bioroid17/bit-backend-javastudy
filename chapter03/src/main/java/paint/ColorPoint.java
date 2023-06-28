package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
//		this.x = x;	// 에러
//		this.y = y;	// 에러
		
//		setX(x);	// 가능하다
//		setY(y);	// 가능하다
		
		super(x, y);	// 부모의 생성자 호출. 반드시 코드 앞에 적어야 함
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// annotation은 단순 마킹 용도. 어떤 코드가 더 돌아가거나 하진 않음
	@Override
	public void show() {
		System.out.println("점[x=" + getX() + ", y=" + getY() + ", color=" + color + "]을 그렸습니다.");
	}
}
