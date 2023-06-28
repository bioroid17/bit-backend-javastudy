package com.bitacademy.paint.point;

import com.bitacademy.paint.i.Drawable;

public class Point implements Drawable {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

//	public void disappear() {
//		System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
//	}

	// 어느 정도 관련 있는 메소드들은 같은 이름으로 파라미터만 다르게 오버로드 해서 만드는 것이 낫다.
	public void show(boolean visible) {
		if (visible) { // visible == true라고 짜지 말자!
			show();
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();
	}
}
