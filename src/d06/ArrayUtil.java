package d06;

public class ArrayUtil {

	public static int[] generageArray(int length, int max) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * max);
		}
		return array;
	}

}
