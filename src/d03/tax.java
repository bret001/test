package d03;

import java.util.Scanner;

public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ĺ��ʵ�˰ǰ��������");
		double salary = scanner.nextDouble();
		scanner.close();
		double tax;
		double taxIncome = salary - 3500;
		if (taxIncome <= 0) {
			tax = 0.0;
		} else if (taxIncome <= 1500) {
			tax = taxIncome * 0.03;
		} else if (taxIncome <= 4500) {
			tax = taxIncome * 0.10 - 105;
		} else if (taxIncome <= 9000) {
			tax = taxIncome * 0.20 - 555;
		} else if (taxIncome <= 35000) {
			tax = taxIncome * 0.25 - 1005;
		} else if (taxIncome <= 55000) {
			tax = taxIncome * 0.30 - 2755;
		} else if (taxIncome <= 80000) {
			tax = taxIncome * 0.35 - 5505;
		} else {
			tax = taxIncome * 0.45 - 13505;
		}
		System.out.println("��Ӧ�ý��ɵĸ�������˰�ǣ���" + tax);

	}

}
