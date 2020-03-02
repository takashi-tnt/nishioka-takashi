import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("一つ目の数字を入力してください>");
		int a = scanner.nextInt();
		System.out.print("二つ目の数字を入力してください>");
		int b = scanner.nextInt();
		System.out.print("三つ目の数字を入力してください>");
		int c = scanner.nextInt();
		scanner.close();
		System.out.println(a + "\n" + b + "\n" + c);
		System.out.println("合計:" + (a + b +c));
		System.out.println("平均(3で割った時):" + (a + b + c)/3);
		System.out.print("平均(3.0で割った時):" + (a + b + c)/3.0);


	}

}
