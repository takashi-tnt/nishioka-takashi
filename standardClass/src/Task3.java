public class Task3 {

	public static void main(String[] args) {

		//文字列の作製、出力
		String text = "文字列: ABCDEFG";
		System.out.println(text);

		//逆文字列の生成、出力
		for (int i = text.length() - 1 ; i >= 0  ;i --) {
			System.out.print(text.charAt(i));
		}



	}

}
