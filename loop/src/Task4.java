import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.print("正の整数を入力してください: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num > 0) {
			System.out.print(num + "の約数: ");
			for(int i = 1; i <= num; i ++) {
				if(i < num && num % i == 0) {
					System.out.print(i + ", ");
				}
				if (i == num) {
					System.out.print(i);
				}

			}
		}

	}

}
