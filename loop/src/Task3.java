import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		//入力処理
		System.out.print("数字を入力してください: ");
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		scan.close();
		//繰り返し処理
		int value = 0;		//桁数の初期値
		while (num != 0) {
			num = num / 10;
			value = value + 1;
		}

		System.out.println("桁数:" +value);



	}

}
