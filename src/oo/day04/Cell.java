package oo.day04;

public class Cell {
	int row;
	int col;

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	Cell() {
		this(0, 0);
	}

	void getCellInfo() {
		System.out.println("(" + row + "," + col + ")");
	}

}
