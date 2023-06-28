package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
//		drawPoint(point1);
		draw(point1);
		point1.show(false);
		
		Point point2 = new Point(200, 150);
//		drawPoint(point2);
		draw(point2);
		point2.show(false);
		
		// 자식이 부모를 레퍼런스 -> 업캐스팅. 암시적 캐스팅 가능
//		Point point3 = new ColorPoint();
//		point3.setX(200);
//		point3.setY(100);
		ColorPoint point3 = new ColorPoint(200, 100, "red");
		point3.setX(200);
		point3.setY(100);
		
//		ColorPoint point4 = (ColorPoint) point3;
//		point4.setColor("red");
		((ColorPoint) point3).setColor("red");
		draw(point3);

		Rectangle rectangle = new Rectangle();
//		drawRectangle(rectangle);
//		drawShape(rectangle);
		draw(rectangle);

		Triangle triangle = new Triangle();
//		drawTriangle(triangle);
//		drawShape(triangle);
		draw(triangle);
		
		Circle circle = new Circle();
//		drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}

	// 이거 다 필요없음
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
	
	// Shape이 도형의 부모 클래스이므로 이 메소드 하나면 굳이 도형별 draw 메소드를 만들 필요 없다.
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
}
