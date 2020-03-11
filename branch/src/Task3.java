import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println(num);
		if (num == 0) {
			System.out.println("入力された値は0です。");
		}else if(num > 0) {
			System.out.println("入力された値は正の数です。");
		}else {
			System.out.println("入力された値は負の数です。");
		}


	}

}
