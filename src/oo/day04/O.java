package oo.day04;

public class O extends Tetromino {
	O(int row, int col) {
		c[0] = new Cell(row, col);
		c[1] = new Cell(row + 1, col);
		c[2] = new Cell(row, col + 1);
		c[3] = new Cell(row + 1, col + 1);
	}
}
