import java.util.ArrayList;
import java.util.HashMap;
public class Task4 {

	public static void main(String[] args) {
		int[] arrayNumbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();

		//拡張for文での書き直し
		for(int number : arrayNumbers) {
			if ( number % 2 == 0) {
				evenNumbers.add(number);
			}else {
				oddNumbers.add(number);
			}
		}

		HashMap<String, ArrayList<Integer>>mapNumberArray = new HashMap<>();
		mapNumberArray.put("偶数:", evenNumbers);
		mapNumberArray.put("奇数:", oddNumbers);
		System.out.println(mapNumberArray.entrySet());


	}

}
