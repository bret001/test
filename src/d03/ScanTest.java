package d03;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���������䣺");
		int age = scan.nextInt();
		System.out.println(age >= 18 && age <= 50);
		// �������
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		System.out.println("���Ϊ��" + year);
		// ������
		System.out.println("������ɼ���");
		int score = scan.nextInt();
		System.out.println("�ɼ�Ϊ��" + score);
		// ����ɼ�
		System.out.println("���������");
		int command = scan.nextInt();
		System.out.println("����Ϊ��" + command);
		scan.close();
	}

}
