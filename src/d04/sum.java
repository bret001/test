package d04;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long nine = 0;
		long result = 0;
		for (int count = 0; count < 10; count++) {
			nine = 10 * nine + 9;
			result = nine + result;
		}
		System.out.println("sum=" + result);
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double n = scan.nextDouble();
		scan.close();
		double sum = 0;
		for (int i = 1; i < n+1; i++) {
			sum += 1.0 / i;
		}
		System.out.println("sum=" + sum);
	}

}
