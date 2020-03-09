import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		String[] array1 = {"a","b","c"};
		String[] array2 = {"a", null, "c"};

		System.out.println("--配列にnullがない場合--");
		System.out.println(nullCheck(array1));

		System.out.println("--配列にnullがある場合--");
		System.out.println(nullCheck(array2));


	}
	public static boolean nullCheck(String[] array) {
		if (Arrays.asList(array).contains(null)) {
			return true;
		}else {
			return false;
		}


	}

}
