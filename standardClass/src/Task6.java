import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println(cal.get(Calendar.YEAR) +"年" +  (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日" + cal.get(Calendar.HOUR_OF_DAY) + "時" + cal.get(Calendar.MINUTE) + "分");
		//SimpleDateForMatを使用する場合
		Date now = new Date();
		SimpleDateFormat f =new SimpleDateFormat("yyyy年MM月dd日");
	    String s = f.format(now);
	    SimpleDateFormat fNew = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
	    String sNew = fNew.format(now);
	    System.out.println(s);
	    System.out.println(sNew);







	}

}
