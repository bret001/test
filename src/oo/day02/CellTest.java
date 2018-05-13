package oo.day02;

import java.util.Scanner;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell(3, 3);
		printWall(c);
		System.out.println();
		System.out.println("1 —— 下落，2——向左，3——向右，0 —— 退出");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while (input != 0) {
			switch (input) {
			case 1:
				c.drop();
				break;
			case 2:
				c.moveleft();
				break;
			case 3:
				c.moveright();
				break;
			}
			printWall(c);
			System.out.println("1 —— 下落，2——向左，3——向右，0 —— 退出");
			input = scan.nextInt();
		}
		System.out.println("游戏结束");
		scan.close();

	}

	public static void printWall(Cell c) {
		int rowcount = 0;
		int colcount = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == c.row && j == c.col) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println(rowcount);
			rowcount++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(colcount + " ");
			colcount++;
		}
	}

}
