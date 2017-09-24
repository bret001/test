package d06;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name("jj5");
		name();
		double a = num();
		System.out.println(a);
		int sum = sum(111, 66);
		System.out.println(sum);

	}

	public static void name(String name) {
		System.out.println(name);
	}

	public static void name() {
		String name = "jjjj";
		System.out.println(name);
	}

	public static double num() {
		double num = Math.random();
		return num;
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
