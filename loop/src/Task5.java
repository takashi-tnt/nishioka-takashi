
public class Task5 {

	public static void main(String[] args) {
		int kuku = 0;
		for(int j = 1; j <= 9; j ++) {
			for(int i = 1; i <= 9; i ++) {
				kuku = j * i;
				if (String.valueOf(kuku).length() == 1) {
					System.out.print("  " + kuku);
				}
				if (String.valueOf(kuku).length() == 2) {
					System.out.print(" " + kuku);
				}
				}
			System.out.println();
		}

	}

}
