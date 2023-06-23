package chapter01;

public class Ex08ArithmeticOperator {

	public static void main(String[] args) {
		final int TIME = 20000;	// 20000초
		int hour = TIME / 60 / 60;
		int minute = TIME / 60 % 60;
		int second = TIME % 60;
		
		System.out.println(TIME + "초는 "+ hour +"시간 "+ minute +"분 "+ second +"초 입니다.");
	}

}
