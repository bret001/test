package d03;

import java.util.Scanner;

public class pay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价：");
		double unitPrice = scan.nextDouble();
		System.out.println("请输入数量");
		double amount = scan.nextDouble();
		System.out.println("请输入金额");
		double money = scan.nextDouble();
		double totalPrice = unitPrice * amount;
		if (totalPrice >= 500) {
			totalPrice *= 0.8;
		}
		if (money > totalPrice) {
			double change = money - totalPrice;
			System.out.println("总价为：" + totalPrice + ",找零：" + change);
		} else {
			System.out.println("错误，收款金额小于应收金额");
		}
		scan.close();
	}
}
