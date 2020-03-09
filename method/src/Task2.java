
public class Task2 {

	public static void main(String[] args) {
		String answer = getTriangleArea(10,15);
		System.out.println(answer);

	}
	public static String getTriangleArea(double bottom_line, double height){
		return "三角形の面積" + "\n" + (double)Math.round(bottom_line * height / 2);
	}

}
