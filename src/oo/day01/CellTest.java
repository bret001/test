package oo.day01;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell();
		c.col = 1;
		c.row = 2;
		c.getCellInfo();
		printwall(c);

	}

	public static void printwall(Cell c) {
		int rowcount = 0;
		int colcount = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == c.row && j == c.col) {
					System.out.print("* ");
				} else
					System.out.print("- ");
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
