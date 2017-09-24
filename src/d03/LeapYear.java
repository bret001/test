package d03;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		boolean leapYear = year%4 == 0 && year%100 != 0 || year % 400 == 0;		
		String str = leapYear?"是闰年":"是平年";
		System.out.println(year+str);
		scan.close();
	}
}
