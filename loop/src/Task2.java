import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		int sum = 0;
		if (num >= 1) {
			for (int i = 1; i <= num; i ++) {
				sum = sum + i;

				if (i == 1){
				System.out.print(i);

				}else {
					System.out.print(" + " +  i);
				}
		}
			System.out.print(" = "+ sum);
	    }
	}

}
