package d03;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入两个数比较大小");
		System.out.println("输入一个数：");
		int a = scan.nextInt();
		System.out.println("输入第二个数：");
		int b = scan.nextInt();
		int c = a>b?a:b;
		System.out.println(c+"为大");
		scan.close();
	}

}