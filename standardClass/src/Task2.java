
public class Task2 {

	public static void main(String[] args) {
		String texts ="Java Programming Training";
		String[] textArray = texts.split(" ");
		System.out.println(textArray[2]);
		System.out.println(textArray[0] + " " + textArray[1]);
		//substring methodでの回答
		System.out.println(texts.substring(17,25));
		System.out.println(texts.substring(0,16));



	}

}
