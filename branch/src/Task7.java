import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {

		//曜日の定数？（ここは変数にするか定数にするか）
		String Monday = "月曜";
		String Tuesday = "火曜";
		String Wednesday = "水曜";
		String Thursday = "木曜";
		String Friday = "金曜";
		String Saturday = "土曜";
		String Sunday = "日曜";
		//標準入力
		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【" + Monday + ", " + Tuesday + ", " + Wednesday + ", " + Thursday + ", " + Friday + ", " + Saturday + ", " + Sunday + "】");
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine();
		scan.close();
		//入力の表示
		System.out.println(day);
		//出力の条件分岐
		if (day.equals(Monday) || day.equals(Tuesday) || day.equals(Wednesday)||day.equals(Thursday)||day.equals(Friday)) {
			System.out.println("午前診療と午後診療があります。");
		}else if(day.equals(Saturday)) {
			System.out.println("土曜は午前診療のみです。");
		}else if(day.equals(Sunday)) {
			System.out.println("日曜は休診です。");
		}else {
			System.out.println("入力をやり直してください。");
		}











	}

}
