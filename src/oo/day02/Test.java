package oo.day02;

public class Test {

	public static void main(String[] args) {
		T t = new T(1, 5);
		printWall(20, 10, t);
	}

	public static void printWall(int row, int col, T t) {
		int rowCount = 1;
		int colCount = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == t.cell[0].row && j == t.cell[0].col) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println(rowCount);
			rowCount++;
		}
		for (int i = 1; i <= col; i++) {
			System.out.print(colCount + " ");
			colCount++;
		}
		System.out.println();
	}
}
