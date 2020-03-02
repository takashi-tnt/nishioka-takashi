
public class Task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;
		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);

		long long_intNum = intNum;
		float float_doubleNum = (float)doubleNum;
		double double_longNum = (double)longNum;



		System.out.println("変換後");
		System.out.println(long_intNum);
		System.out.println(float_doubleNum);
		System.out.println(double_longNum);




	}

}
