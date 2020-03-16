import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		String[] array1 = {"a","b","c"};
		String[] array2 = {"a", null, "c"};

		System.out.println("--配列にnullがない場合--");
		System.out.println(nullCheck(array1));
		System.out.println(nullCheckB(array1));

		System.out.println("--配列にnullがある場合--");
		System.out.println(nullCheck(array2));
		System.out.println(nullCheckB(array2));


	}
	public static boolean nullCheck(String[] array) {
		if (Arrays.asList(array).contains(null)) {
			return true;
		}else {
			return false;
		}



	}
	public static boolean nullCheckB(String[] array) {
		int contentNull = 0;
		for(int i = 0; i <= array.length - 1; i ++) {
			if(array[i] == null) {
				contentNull = 1;
				break;
			}
		}
		if(contentNull == 0) {
			return false;
		}else {
			return true;
		}
	}

}
