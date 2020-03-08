
public class Task2 {

	public static void main(String[] args) {
		String answer = getTriangleArea(10,15);
		System.out.println(answer);

	}
	public static String getTriangleArea(double bottom_line, double height){
		double area = ((double)Math.round((bottom_line * height / 2)*10)) /10;
		return "三角形の面積" + "\n" + area;
	}

}
