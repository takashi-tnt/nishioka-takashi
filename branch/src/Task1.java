import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		System.out.println("10以上の数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		if (number >= 10) {
			System.out.println(number);
			System.out.println("値:" + number);
		}
		if (number>=1 && number <10) {
			System.out.println(number);
			System.out.println("値:" + number * 10);
		}

	}

}
