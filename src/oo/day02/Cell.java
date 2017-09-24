package oo.day02;

public class Cell {
	int row;
	int col;

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	Cell() {
		this(1, 5);
	}

	Cell(int n) {
		this(n, n);
	}

	String getCellInfo() {
		return "(" + row + "," + col + ")";
	}
}
