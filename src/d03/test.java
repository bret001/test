package d03;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������������Ƚϴ�С");
		System.out.println("����һ������");
		int a = scan.nextInt();
		System.out.println("����ڶ�������");
		int b = scan.nextInt();
		int c = a>b?a:b;
		System.out.println(c+"Ϊ��");
		scan.close();
	}

}