import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		//1.
		String item_value = "ノートPCの値段: ";
		int value = 89800;
		System.out.println(item_value + value);
		//2.
		Scanner scan = new Scanner(System.in);
		String first_str = scan.nextLine();
		String second_str = scan.nextLine();
		scan.close();
		System.out.println(first_str);
		System.out.println(second_str);
		System.out.println(first_str + second_str);


	}

}
