
public class Task2 {

	public static void main(String[] args) {
		int[] array= new int[7];

		for (int index =0 ; index <= 6 ; index ++) {
			array[index] = 7 - index;
			if (index <6 ) {
				System.out.print(array[index] + ", ");
			}
			if (index == 6) {
				System.out.println(array[index]);
			}
		}
		for(int index =6 ; index >=0 ;index --) {
			if (index>0) {
				System.out.print(array[index] + ", ");
			}
			if (index ==0 ) {
				System.out.print(array[index]);
			}
		}


	}

}
