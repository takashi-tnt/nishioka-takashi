import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		//numA,B,Cの入力
		Scanner scan = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		scan.close();

		System.out.println("numA: " + numA);
		System.out.println("numB: " + numB);
		System.out.println("numC: " + numC);

		int max = 0; //変数の初期値
		//条件分岐
		if(numA > numB && numA > numC) {
			max = numA;
		}
		if(numB > numA && numB >numC) {
			max = numB;
		}
		if(numC > numA && numC > numA) {
			max = numC;
		}


		System.out.println("最大値: " + max);


	}

}
