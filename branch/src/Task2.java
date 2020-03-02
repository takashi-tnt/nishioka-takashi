import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		if (number >= 10){
			System.out.println(number);
			System.out.println("値: " + number);
		}
		if (number<10 && number >0) {
			System.out.println(number);
			System.out.println("値: " + 0 +number);
		}

	}

}
