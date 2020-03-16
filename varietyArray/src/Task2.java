import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {
		//配列の定義
		int[] arrayNumbers = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		//偶数、奇数の配列
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();

		//拡張for文で書き直しました
		for(int number : arrayNumbers) {
			if (number % 2 == 0) {
				evenNumbers.add(number);		//偶数で分ける
			}else {
				oddNumbers.add(number);			//奇数で分ける
			}
		}
		//奇数の出力
		System.out.print("奇数: [");
		for(int j = 0; j < oddNumbers.size(); j ++) {
			if (j < oddNumbers.size() -1 ) {
				System.out.print(oddNumbers.get(j) + ",");
			}else {
				System.out.print(oddNumbers.get(j));
			}

		}
		System.out.println("]");
		//偶数の出力
		System.out.print("偶数: [");
		for(int k = 0; k < evenNumbers.size() ;k ++) {
			if(k < evenNumbers.size() -1) {
				System.out.print( evenNumbers.get(k)+ ",");
			}else {
				System.out.print(evenNumbers.get(k));
			}

		}
		System.out.println("]");



	}

}
