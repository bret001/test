package oo.day01;

public class Cell {
	int row;
	int col;

	void drop(int n) {
		row++;
		if (row > n) {
			row = n;
		}
	}

	void moveLeft(int n) {
		col -= n;
	}

	void moveRight(int n) {
		col += n;
	}

	void autoMoveRight(int n) {
		col++;
		if (col > n) {
			col = n;
		}
	}

	void autoMoveLeft() {
		col--;
		if (col < 0) {
			col = 0;
		}
	}

	String getCellInfo() {
		return row + "," + col;
	}
}
