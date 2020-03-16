import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();

		String str ="ABCDGOPQRSYZ";
		if(str.indexOf(text) >= 0) {
			System.out.println(str + "は" + text + "を含む。");
		}else {
			System.out.println(str + "は" + text + "を含まない。");
		}




	}

}
