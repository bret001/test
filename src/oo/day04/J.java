package oo.day04;

public class J extends Tetromino {
	J(int row, int col) {
		c[0] = new Cell(row, col);
		c[1] = new Cell(row + 1, col);
		c[2] = new Cell(row + 2, col);
		c[3] = new Cell(row + 2, col - 1);
	}

}
