package oo.day01;

public class Cell {
	int col; // ÁÐºÅ
	int row; // ÐÐºÅ

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
