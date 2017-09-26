package oo.day02;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell(2,3);
		System.out.println(c.getCellInfo());
		printWall(20, 10, c);
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
	}
}