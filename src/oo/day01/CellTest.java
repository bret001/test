package oo.day01;

import java.util.Scanner;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell();
		c.row = 1;
		c.col = 5;
		Scanner scan = new Scanner(System.in);
		int control;
		do {
			System.out.println("位置：(" + c.getCellInfo() + ")");
			printWall(20, 10, c);
			System.out.println("1--下落，2--向左，3--向右，0--退出");
			control = scan.nextInt();
			if (control == 1) {
				c.drop(20);
			} else if (control == 2) {
				c.autoMoveLeft();
			} else if (control == 3) {
				c.autoMoveRight(10);
			} else if (control != 0) {
				System.out.println("输入错误，请重新输入");
			}
		} while (control != 0);
		scan.close();
		System.out.println("游戏结束");
	}

	public static void printWall(int totalRow, int totalCol, Cell cc) {
		int rowCount = 1;
		int colCount = 1;
		for (int i = 1; i <= totalRow; i++) {
			for (int j = 1; j <= totalCol; j++) {
				if (i == cc.row && j == cc.col) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println(" " + rowCount);
			rowCount++;
		}
		for (int num = 1; num <= totalCol; num++) {
			System.out.print(colCount + " ");
			colCount++;
		}
		System.out.println();
		System.out.println();
	}
}