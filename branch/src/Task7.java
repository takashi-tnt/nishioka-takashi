import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {

		//曜日の定数？（ここは変数にするか定数にするか）
		String MONDAY = "月曜";
		String TUESDAY = "火曜";
		String WEDNESDAY = "水曜";
		String THURSDAY = "木曜";
		String FRIDAY = "金曜";
		String SATURDAY = "土曜";
		String SUNDAY = "日曜";
		//標準入力
		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【" + MONDAY + ", " + TUESDAY + ", " + WEDNESDAY + ", " + THURSDAY + ", " + FRIDAY + ", " +  SATURDAY  + ", " + SUNDAY + "】");
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine();
		scan.close();
		//入力の表示
		System.out.println(day);

		//出力の条件分岐
		switch(day) {
			case "月曜":
			case "火曜":
			case "水曜":
			case "木曜":
			case "金曜":
				System.out.println("午前診療と午後診療があります。");
				break;
			case "土曜":
				System.out.println("土曜は午前診療のみです。");
				break;
			case "日曜":
				System.out.println("日曜は休診です。");
				break;
			default:
				System.out.println("入力をやり直してください。");
		}











	}

}
