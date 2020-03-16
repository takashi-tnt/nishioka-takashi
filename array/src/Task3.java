import java.util.Random;
public class Task3 {

	public static void main(String[] args) {
		int[] array= new int[6];
		System.out.print("[");
		Random r = new Random();
		for (int index =0 ; index <= 5 ; index ++) {
			array[index] = r.nextInt(10);
			if (index < 5) {
				System.out.print(array[index] + ", ");
			}
			if (index == 5) {
				System.out.println(array[index] + "]");
			}
		}
		int max = array[0];
		int min = array[0];
		for(int index =0 ; index <= 5; index ++) {
			 int number = array[index];
			    if (number > max) {
			        max = number;
			    }
			    if (number < min) {
			        min = number;
			    }
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);


	}

}
