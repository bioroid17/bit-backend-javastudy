package paint;

public abstract class Shape implements Drawable {
	// 추상 클래스란, 추성 매소드를 1개 이상 가지는 클래스를 의미
	private String lineColor;
	private String fillColor;
	
	public String getLineColor() {	// 콘크리트 메소드
		return lineColor;
	}

	public void setLineColor(String lineColor) {	// 콘크리트 메소드
		this.lineColor = lineColor;
	}

	public String getFillColor() {	// 콘크리트 메소드
		return fillColor;
	}

	public void setFillColor(String fillColor) {	// 콘크리트 메소드
		this.fillColor = fillColor;
	}
}
