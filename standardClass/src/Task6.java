import java.util.Calendar;
public class Task6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println(cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日" + cal.get(Calendar.HOUR_OF_DAY) + "時" + cal.get(Calendar.MINUTE) + "分");
;






	}

}
