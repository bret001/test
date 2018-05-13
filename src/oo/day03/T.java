package oo.day03;

public class T {
	Cell[] c;

	T(int row, int col) {
		c = new Cell[4];
		c[0] = new Cell(row, col);
		c[1] = new Cell(row, col + 1);
		c[2] = new Cell(row, col + 2);
		c[3] = new Cell(row + 1, col + 1);
	}
}
