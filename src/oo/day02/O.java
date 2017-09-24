	package oo.day02;

public class O {
	Cell[] cell;

	O(int row, int col) {
		cell = new Cell[4];
		cell[0] = new Cell(row, col);
		cell[1] = new Cell(row, col + 1);
		cell[2] = new Cell(row + 1, col);
		cell[3] = new Cell(row + 1, col + 1);
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
