import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {

		int arrayNumbers[] = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for(int i =0;i<arrayNumbers.length;i ++) {
			if (arrayNumbers[i] % 2 == 0) {
				evenNumbers.add(arrayNumbers[i]);
			}else {
				oddNumbers.add(arrayNumbers[i]);
			}
		}
		System.out.print("奇数: [");
		for(int j = 0; j<oddNumbers.size(); j ++) {
			if (j < oddNumbers.size() -1 ) {
				System.out.print(oddNumbers.get(j) + ",");
			}else {
				System.out.print(oddNumbers.get(j));
			}

		}
		System.out.println("]");

		System.out.print("偶数: [");
		for(int k= 0; k< evenNumbers.size();k ++) {
			if(k<evenNumbers.size() -1) {
				System.out.print( evenNumbers.get(k)+ ",");
			}else {
				System.out.print(evenNumbers.get(k));
			}

		}
		System.out.println("]");



	}

}
