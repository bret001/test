package d04;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int sum = 0;
		for (int count = 1; count <= 10; count++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int flag = a + b;
			System.out.println("(" + count + ")" + a + "+" + b + "=?" + "\r" + "������𰸣�");
			sum = scan.nextInt();
			if (sum == -1) {
				break;
			}
			if (sum == flag) {
				System.out.println("�����");
				point += 10;
			} else {
				System.out.println("����ˣ���ȷ��Ϊ��" + flag);
			}
		}
		scan.close();
		if (sum == -1) {
			System.out.println("��ӭ�´�����");
		} else {
			System.out.println("������յ÷�Ϊ��" + point);
		}
	}
}
