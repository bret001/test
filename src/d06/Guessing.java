package d06;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		System.out.println("��ӭ���Բ���ĸ��Ϸ��");
		Scanner scan = new Scanner(System.in);
		int level;
		do {
			System.out.println("��������Ϸ����5��7��9��?");
			level = scan.nextInt();
		} while (level != 5 && level != 7 && level != 9);

		char[] chs = generate(level);
		System.out.print("���״𰸣�");
		System.out.println(chs);
		int count = 0;
		while (true) {
			String str = scan.next().toUpperCase();
			if (str.equals("EXIT")) {
				System.out.println("��ӭ�´�����");
				break;
			}
			char[] input = str.toCharArray();
			int[] check = check(chs, input);
			if (check[1] == chs.length) {
				int score = 100 * chs.length - 10 * count;
				System.out.println("��ϲ��¶���! ��ĵ÷�Ϊ��" + score);
				break;
			} else {
				count++;
				System.out.println("��¶�" + check[0] + "���ַ�������" + check[1] + "���ַ���λ����ȷ�� ���ܴ���=" + count + "�� exit--�˳���");
			}
		}
		scan.close();
	}

	public static char[] generate(int level) {
		char[] chs = new char[level];
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flag = new boolean[letters.length];
		for (int i = 0; i < chs.length; i++) {
			int num;
			do {
				num = (int) (Math.random() * letters.length);
			} while (flag[num]);
			chs[i] = letters[num];
			flag[num] = true;
			
		}
		return chs;
	}

	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2]; // int[0]�����ַ��Ƿ���ȷ��int[1]����λ���Ƿ���ȷ

		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[0]++;
					if (i == j) {
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}
}