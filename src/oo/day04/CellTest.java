package oo.day04;

public class CellTest {

	public static void main(String[] args) {
		Tetromino t = new T(0, 2);
		t.print();

		Tetromino j = new J(0, 2);
		j.print();

	}

	public static void printWall(Tetromino cell) {
		int rowCount = 0;
		int colCount = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				boolean flag = true;
				for (int k = 0; k < cell.c.length; k++) {
					if (i == cell.c[k].row && j == cell.c[k].col) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print("- ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println(rowCount);
			rowCount++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(colCount + " ");
			colCount++;
		}
		System.out.println();
	}

}
