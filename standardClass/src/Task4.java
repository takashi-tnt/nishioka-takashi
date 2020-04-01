import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		String str ="ABCDGOPQRSYZ";
		System.out.print("探したい文字: ");
		//標準入力
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();
		//標準入力した文字列の含有の比較
		if(str.indexOf(text) >= 0) {
			System.out.println(str + "は" + text + "を含む。");
		}else {
			System.out.println(str + "は" + text + "を含まない。");
		}




	}

}
