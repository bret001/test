package d03;

import java.util.Scanner;

public class command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择功能：1.显示全部记录 2.查询登录记录 0.退出");
		int command = scan.nextInt();
		switch (command) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 0:
			System.out.println("退出");
		default:
			System.out.println("输入错误");
		}
		scan.close();
	}

}
