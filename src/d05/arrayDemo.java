package d05;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入查找质数的范围：2~");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = 2; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
				if (++count % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
