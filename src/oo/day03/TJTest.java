package oo.day03;

public class TJTest {

	public static void main(String[] args) {
		T t = new T(2, 3);
		System.out.println("下落前");
		t.getCellInfo();
		System.out.println("下落后");
		t.drop(1);
		t.getCellInfo();
		System.out.println("左移后");
		t.moveLeft(1);
		t.getCellInfo();

	}

}
