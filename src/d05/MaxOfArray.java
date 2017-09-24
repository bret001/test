package d05;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i]);
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("最大值为：" + max);
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("最小值为：" + min);
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = max;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
