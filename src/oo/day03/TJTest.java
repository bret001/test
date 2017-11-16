package oo.day03;

public class TJTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tetromino j = new J(1, 2);
		printWall(j, 20, 10);
		System.out.println();
		Tetromino l = new L(1, 2);
		printWall(l, 20, 10);
		System.out.println();
		Tetromino o = new O(1, 2);
		printWall(o, 20, 10);
		System.out.println();
		Tetromino t = new T(1, 2);
		printWall(t, 20, 10);

	}

	public static void printWall(Tetromino style, int totalRow, int totalCol) {
		int rowCount = 1;
		int colCount = 1;
		for (int i = 1; i <= totalRow; i++) {
			for (int j = 1; j <= totalCol; j++) {
				boolean flag = true;
				for (int k = 0; k < style.cells.length; k++) {
					if (i == style.cells[k].row && j == style.cells[k].col) {
						System.out.print("* ");
						flag = false;
					}
				}
				if (flag) {
					System.out.print("- ");
				}
			}
			System.out.println(rowCount);
			rowCount++;
		}
		for (int i = 1; i <= totalCol; i++) {
			System.out.print(colCount + " ");
			colCount++;
		}
	}

}
