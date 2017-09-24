package d04;

import java.util.Scanner;

public class whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * 1000 + 1);
		int guess;
		do {
			System.out.println("Guess！");
			guess = scan.nextInt();
			if (guess == 0) {
				break;
			}
			if (guess > num) {
				System.out.println("太大了");
			} else if (guess < num) {
				System.out.println("太小了");
			}
		} while (guess != num);
		if (guess == 0) {
			System.out.println("欢迎下次再来");
		} else {
			System.out.println("猜对了");
		}
		scan.close();
	}
}