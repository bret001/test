package d03;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = scan.nextDouble();
		if (score < 0 || score > 100) {
			System.out.println("�ɼ����Ϸ�");
		} else if (score >= 90) {
			System.out.println("�ɼ�ΪA");
		} else if (score >= 80) {
			System.out.println("�ɼ�ΪB");
		} else if (score >= 60) {
			System.out.println("�ɼ�ΪC");
		} else {
			System.out.println("�ɼ�ΪD");
		}
		scan.close();
	}

}
