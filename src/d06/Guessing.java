package d06;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		System.out.println("欢迎尝试猜字母游戏！");
		Scanner scan = new Scanner(System.in);
		int level;
		do {
			System.out.println("请输入游戏级别（5、7、9）?");
			level = scan.nextInt();
		} while (level != 5 && level != 7 && level != 9);

		char[] chs = generate(level);
		System.out.print("作弊答案：");
		System.out.println(chs);
		int count = 0;
		while (true) {
			String str = scan.next().toUpperCase();
			if (str.equals("EXIT")) {
				System.out.println("欢迎下次再来");
				break;
			}
			char[] input = str.toCharArray();
			int[] check = check(chs, input);
			if (check[1] == chs.length) {
				int score = 100 * chs.length - 10 * count;
				System.out.println("恭喜你猜对了! 你的得分为：" + score);
				break;
			} else {
				count++;
				System.out.println("你猜对" + check[0] + "个字符，其中" + check[1] + "个字符的位置正确！ （总次数=" + count + "， exit--退出）");
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
		int[] result = new int[2]; // int[0]计算字符是否正确，int[1]计算位置是否正确

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