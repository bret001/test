
package oo.day03;

public class RefArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cell[] c = new Cell[4];
		c[0] = new Cell(1, 3);
		c[1] = new Cell(1, 4);
		c[2] = new Cell(1, 5);
		c[3] = new Cell(2, 4);

		Cell[] cc = new Cell[] { new Cell(1, 3), new Cell(1, 4), new Cell(1, 5), new Cell(2, 4) };

		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][0] = 100;

		int[][] ar = new int[3][4];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				arr[i][j] = 100;
			}
		}
	}

}
