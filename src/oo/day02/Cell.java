package oo.day02;

public class Cell {
	int row;// ÐÐºÅ
	int col;// ÁÐºÅ

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
