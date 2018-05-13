package oo.day03;

public class CellTest {

	public static void main(String[] args) {
		T t = new T(0,0);
		printWall(t);

	}

	public static void printWall(T t) {
		int rowCount = 0;
		int colCount = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == t.c[0].row && j == t.c[0].col) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println(rowCount);
			rowCount++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(colCount + " ");
			colCount++;
		}
	}

}
