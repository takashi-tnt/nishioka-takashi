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

		int day_number = 0;

		if (day.equals(MONDAY)||day.equals(TUESDAY)||day.equals(WEDNESDAY)||day.equals(THURSDAY)||day.equals(FRIDAY)) {
			day_number = 1;
		}else if(day.equals(SATURDAY)){
			day_number = 2;
		}else if(day.equals(SUNDAY)) {
			day_number = 3;
		}
		//出力の条件分岐
		switch(day_number) {
			case 1:
				System.out.println("午前診療と午後診療があります。");
				break;
			case 2:
				System.out.println("土曜は午前診療のみです。");
				break;
			case 3:
				System.out.println("日曜は休診です。");
				break;
			default:
				System.out.println("入力をやり直してください。");
		}











	}

}
