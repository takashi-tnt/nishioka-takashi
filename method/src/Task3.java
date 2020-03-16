
public class Task3 {

	public static void main(String[] args) {
		System.out.println("--①文字列だけの場合---");
		String stringAdd = add("西", "隆志");
		System.out.println(stringAdd);

		System.out.println("---②整数だけの場合---");
		int intAdd = add(1, 2);
		System.out.println(intAdd);

		System.out.println("---③小数だけの場合---");
		double doubleAdd = add(1.5, 3.4);
		System.out.println(doubleAdd);


	}
	public static String add(String a, String b) {;
		return a + b;
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}


}
