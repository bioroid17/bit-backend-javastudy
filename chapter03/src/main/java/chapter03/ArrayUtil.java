package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		double[] result = null;

		if (a1 == null) {
			return result;
		}

		result = new double[a1.length];
		for (int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}

		return result;
	}

	public static int[] doubleToInt(double[] a1) {
		int[] result = null;

		if (a1 == null) {
			return result;
		}

		result = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			result[i] = (int) a1[i];
		}

		return result;
	}

	public static int[] concat(int[] a1, int[] a2) {
		if (a1 == null && a2 == null) {
			return null;
		} else if (a1 == null && a2 != null) {
			return a2;
		} else if (a1 != null && a2 == null) {
			return a1;
		}

		int[] a3 = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}
		for (int i = a1.length; i < a1.length + a2.length; i++) {
			a3[i] = a2[i - a1.length];
		}

		return a3;
	}
}
