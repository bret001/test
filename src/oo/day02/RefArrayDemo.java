package oo.day02;

public class RefArrayDemo {

	public static void main(String[] args) {
		Cell[] c = new Cell[3];
		c[0] = new Cell(1, 2);
		c[1] = new Cell(2, 3);
		c[2] = new Cell(3, 4);
		System.out.println("坐标为：" + c[0].getCellInfo());
		printWall(20, 10, c[0]);

		Cell[] cc = new Cell[] { new Cell(4, 5), new Cell(5, 6) };
		System.out.println("坐标为：" + cc[0].getCellInfo());
		printWall(20, 10, cc[0]);
		
		Cell[][] ccc=new Cell[3][];
		ccc[0]=new Cell[]{new Cell(1,2),new Cell(2,3)};
		System.out.println("坐标为：" + ccc[0][1].getCellInfo());
		printWall(20, 10, ccc[0][1]);

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
