package oo.day02;

public class Cell {
	int row;// �к�
	int col;// �к�

	void moveleft() {
		col--;
	}

	void moveright() {
		col++;
	}

	void drop() {
		row++;
	}

	void getCellInfo() {
		System.out.println(row + "," + col);
	}

}
