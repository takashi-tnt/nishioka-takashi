import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		String[] array1 = {"a","b","c"};
		String[] array2 = {"a", null, "c"};
		boolean answer1 = nullCheck(array1);
		boolean answer2 = nullCheck(array2);
		System.out.println("--配列にnullがない場合--");
		System.out.println(answer1);
		System.out.println("--配列にnullがある場合--");
		System.out.println(answer2);


	}
	public static boolean nullCheck(String[] array) {
		if (Arrays.asList(array).contains(null)) {
			return true;
		}else {
			return false;
		}


	}

}
