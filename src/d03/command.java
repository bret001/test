package d03;

import java.util.Scanner;

public class command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼ 2.��ѯ��¼��¼ 0.�˳�");
		int command = scan.nextInt();
		switch (command) {
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��¼��¼");
			break;
		case 0:
			System.out.println("�˳�");
		default:
			System.out.println("�������");
		}
		scan.close();
	}

}
