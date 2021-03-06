package oo.day02;

public class Cell {
	int row;
	int col;

	Cell(int row, int col) {
		this.row = row; // �к�
		this.col = col; // �к�
	}

	Cell(int n) {
		this(n, n);
	}

	Cell() {
		this(0, 0);
	}

	void moveleft() {
		col--;
	}

	void moveright() {
		col++;
	}

	void moveright(int n) {
		col += n;
	}

	void drop() {
		row++;
	}

	void drop(int n) {
		row += n;
	}

	void getCellInfo() {
		System.out.println(row + "," + col);
	}

}
