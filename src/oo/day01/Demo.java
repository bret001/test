package oo.day01;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cell c1 = new Cell();
		Cell c2 = c1;
		c1.row=2;
		c2.row=5;
		System.out.println(c1.row);
		Cell c3 = new Cell();
		c3 = null;
		c3.row=2;
	}

}
