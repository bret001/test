package oo.day02;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell();
		c.row = 1;
		c.col = 2;
		c.drop();
		c.getCellInfo();
		printWall(c);

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
