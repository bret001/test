package d03;

import java.util.Scanner;

public class threeOfMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入三个整数：");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("最大值为：" + max);
	}

}
