import java.util.ArrayList;
import java.util.HashMap;
public class Task4 {

	public static void main(String[] args) {
		int arrayNumbers[] = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for(int i =0;i<arrayNumbers.length;i ++) {
			if (arrayNumbers[i] % 2 == 0) {
				evenNumbers.add(arrayNumbers[i]);
			}else {
				oddNumbers.add(arrayNumbers[i]);
			}
		}
		HashMap<String, ArrayList<Integer>>map_number_array = new HashMap<>();
		map_number_array.put("偶数:", evenNumbers);
		map_number_array.put("奇数:", oddNumbers);
		System.out.println(map_number_array.entrySet());


	}

}
