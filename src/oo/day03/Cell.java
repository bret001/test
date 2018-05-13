package oo.day03;

public class Cell {
	int row; // �к�
	int col; // �к�

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	Cell(int n) {
		this(n, n);
	}

	Cell() {
		this(0, 0);
	}

	void drop() {
		row++;
	}

	void drop(int n) {
		row += n;
	}

	void moveLeft() {
		col--;
	}

	void moveLeft(int n) {
		col -= n;
	}

	void getCellInfo() {
		System.out.println(row + "," + col);
	}

}
