package d05;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入查找质数的范围：2~");
		int num = scan.nextInt();
		scan.close();
		if (num < 2) {
			System.out.println("输入错误");
		} else {
			int numOfPrime = 0;
			for (int n = 2; n <= num; n++) {
				int m = (int) Math.sqrt(n);
				int i = 2;
				for (; i <= m; i++) {
					if (n % i == 0)
						break;
				}
				if (i > m) {
					System.out.print(n + " ");
					if (++numOfPrime % 10 == 0) {
						System.out.println();
					}	
				}
			}
			System.out.println("\n共有" + numOfPrime + "个质数");
		}
	}

}
