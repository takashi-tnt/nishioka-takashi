import java.util.Calendar;
public class Task7 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("現在日時: " + cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("一週間後: " + cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		System.out.println("一年後　: " + cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");


	}

}
