
public class Task1 {

	public static void main(String[] args) {
		int[] array = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
		int sum = 0;
		System.out.print("配列: [");
			for(int index = 0;index <= 10;index ++) {
				if (index < 10) {
				System.out.print(array[index] + ",");
				}
				if(index == 10) {
				System.out.println(array[index] + "]");
				}
			 sum = sum + array[index];
			}
		System.out.println("合計: " + sum);

	}

}
