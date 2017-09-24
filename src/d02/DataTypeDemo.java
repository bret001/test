package d02;
import java.util.Scanner;
public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a;
		a = System.currentTimeMillis();
		System.out.println(a);
		char b = 5125;
		boolean c = true;
		System.out.println('2');
		byte d=5;
		byte e=6;
		byte f=(byte)(d+e);
		System.out.println(f);
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		age++;
		System.out.println(age);
	}

}
