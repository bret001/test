package oo.day02;

public class J extends Tetromino{

	J(int row, int col) {
		cell[0] = new Cell(row, col);
		cell[1] = new Cell(row + 1, col);
		cell[2] = new Cell(row + 2, col);
		cell[3] = new Cell(row + 2, col - 1);
	}
}
