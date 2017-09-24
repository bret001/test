package oo.day02;

public class Test {

	public static void main(String[] args) {
		J t = new J(1,5);
		System.out.println("初始位置");
		t.print();
		System.out.println("下落后");
		t.drop();
		t.print();
		System.out.println("左以后");
		t.moveLeft();
		t.print();
		System.out.println("右移后");
		t.moveRight();
		t.print();
	}
	
	public static void printWall(int row, int col, Cell cell) {
		int rowCount = 1;
		int colCount = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == cell.row && j == cell.col) {
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
