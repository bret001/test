package d03;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = scan.nextDouble();
		if (score < 0 || score > 100) {
			System.out.println("成绩不合法");
		} else if (score >= 90) {
			System.out.println("成绩为A");
		} else if (score >= 80) {
			System.out.println("成绩为B");
		} else if (score >= 60) {
			System.out.println("成绩为C");
		} else {
			System.out.println("成绩为D");
		}
		scan.close();
	}

}
