import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Task7 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//SimpleDateForMatを使用する場合
		SimpleDateFormat f =new SimpleDateFormat("yyyy年MM月dd日");
	    String s = f.format(cal.getTime());
	    System.out.println("現在日時: " + s);
	    //一週間後
	    cal.add(Calendar.DAY_OF_MONTH, 7);
	    s = f.format(cal.getTime());
	    System.out.println("一週間後: " + s);
	    //一年後
	    cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		s = f.format(cal.getTime());
		System.out.println("一年後　: " + s);
	}

}
