package practice;
import java.io.Serializable;
import java.util.Date;
public class FortuneBean implements Serializable {
	private Date today;
	private String fortune;

	public FortuneBean() {};

	public void setToday(Date today) {
		this.today = today;
	}
	public Date getToday() {
		return this.today;
	}

	public void setFortune(String fortune) {
		this.fortune = fortune;
	}
	public String getFortune() {
		return this.fortune;
	}

}
