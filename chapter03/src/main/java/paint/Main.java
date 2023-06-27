package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
		drawPoint(point1);
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
}
