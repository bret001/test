package oo.day03;

public class Tetromino {
	Cell[] c;

	Tetromino() {
		c = new Cell[4];
	}

	void drop(int n) {
		for (int i = 0; i < c.length; i++) {
			c[i].row += n;
		}
	}

	void moveLeft(int n) {
		for (int i = 0; i < c.length; i++) {
			c[i].col -= n;
		}
	}

	void getCellInfo() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].row + "," + c[i].col);
		}
	}

}
