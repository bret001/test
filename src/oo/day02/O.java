package oo.day02;

public class O extends Tetromino {

	O(int row, int col) {
		cell[0] = new Cell(row, col);
		cell[1] = new Cell(row, col + 1);
		cell[2] = new Cell(row + 1, col);
		cell[3] = new Cell(row + 1, col + 1);
	}
}
