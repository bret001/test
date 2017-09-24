package d05;

public class multiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <=9; num++) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + "*" + num + "=" + num * i + "\t");
			}
			System.out.println();
		}

	}

}
