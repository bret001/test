package d03;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		System.out.println(age >= 18 && age <= 50);
		// 输出年龄
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("年份为：" + year);
		// 输出年份
		System.out.println("请输入成绩：");
		int score = scan.nextInt();
		System.out.println("成绩为：" + score);
		// 输出成绩
		System.out.println("请输入命令：");
		int command = scan.nextInt();
		System.out.println("命令为：" + command);
		scan.close();
	}

}
