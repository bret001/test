package d03;

import java.util.Scanner;

public class pay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뵥�ۣ�");
		double unitPrice = scan.nextDouble();
		System.out.println("����������");
		double amount = scan.nextDouble();
		System.out.println("��������");
		double money = scan.nextDouble();
		double totalPrice = unitPrice * amount;
		if (totalPrice >= 500) {
			totalPrice *= 0.8;
		}
		if (money > totalPrice) {
			double change = money - totalPrice;
			System.out.println("�ܼ�Ϊ��" + totalPrice + ",���㣺" + change);
		} else {
			System.out.println("�����տ���С��Ӧ�ս��");
		}
		scan.close();
	}
}
