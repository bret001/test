package oo.day02;

public class Tetromino {
	Cell[] cell;

	Tetromino() {
		cell = new Cell[4];
	}

	void drop() {
		for (int i = 0; i < cell.length; i++) {
			cell[i].row++;
		}
	}

	void moveLeft() {
		for (int i = 0; i < cell.length; i++) {
			cell[i].col--;
		}
	}

	void moveRight() {
		for (int i = 0; i < cell.length; i++) {
			cell[i].col++;
		}
	}

	void print() {
		for (int i = 0; i < cell.length; i++) {
			System.out.println(cell[i].getCellInfo());
		}
	}
}
