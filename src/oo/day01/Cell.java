package oo.day01;

public class Cell {
	int col; // �к�
	int row; // �к�

	void drop() {
		row++;
	}

	void moveright() {
		col++;
	}

	void moverleft() {
		col--;
	}

	void getCellInfo() {
		System.out.println(row + "," + col);
	}

}
