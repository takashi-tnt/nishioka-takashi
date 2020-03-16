
public class Task2 {

	public static void main(String[] args) {
		double answer = getTriangleArea(10,15);
		System.out.println("三角形の面積" + answer);

	}
	public static double getTriangleArea(double bottom_line, double height){
		return  (double)Math.round(bottom_line * height / 2);
	}

}
