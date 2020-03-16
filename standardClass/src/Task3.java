
public class Task3 {

	public static void main(String[] args) {

		//文字列の作製、出力
		String alphabets = "ABCDEFG";
		String words = "文字列: ";
		String text = words + alphabets;
		System.out.println(text);

		//逆文字列の生成、出力
		String reverse_text = "";

		for (int i=text.length() - 1 ; i >0  ;i --) {
			reverse_text = reverse_text + text.substring(i - 1, i);
		}
		System.out.println(reverse_text);


	}

}
