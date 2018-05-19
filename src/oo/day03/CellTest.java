package oo.day03;

public class CellTest {

	public static void main(String[] args) {
		T t = new T(0, 0);
		printWall(t);

	}

	public static void printWall(T t) {
		int rowCount = 0;
		int colCount = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				boolean flag = true;
				for (int k = 0; k < t.c.length; k++) {
					if (i == t.c[k].row && j == t.c[k].col) {
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
	}

}
