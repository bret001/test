package oo.day04;

public class T extends Tetromino {
	T(int row, int col) {
		c[0] = new Cell(row, col);
		c[1] = new Cell(row, col + 1);
		c[2] = new Cell(row, col + 2);
		c[3] = new Cell(row + 1, col + 1);
	}

	T() {
		this(0, 0);
	}
	
	void print() {
		System.out.println("This is T");
		super.print();
	}

}
