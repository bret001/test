package oo.day03;

public class TJTest {

	public static void main(String[] args) {
		T t = new T(2, 3);
		System.out.println("����ǰ");
		t.getCellInfo();
		System.out.println("�����");
		t.drop(1);
		t.getCellInfo();
		System.out.println("���ƺ�");
		t.moveLeft(1);
		t.getCellInfo();

	}

}
