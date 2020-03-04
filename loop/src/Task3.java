import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください: ");
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		scan.close();
		int value = String.valueOf( num ).length();
		System.out.println("桁数:" +value);


	}

}
