package d03;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		boolean leapYear = year%4 == 0 && year%100 != 0 || year % 400 == 0;		
		String str = leapYear?"������":"��ƽ��";
		System.out.println(year+str);
		scan.close();
	}
}
