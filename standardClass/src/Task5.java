
public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] split_str =str.split("_") ;
		//文字列定数の定義
		String CAT = "cat";
		String MOUSE = "mouse";
		//数を数えるための変数、初期値を定義
		int cat_number = 0;
		int mouse_number = 0;
		//cat,mouseの数をループ処理で数える
		for(int i = 0; i <= split_str.length-1 ; i ++ ) {
			if (split_str[i].equals(CAT)) {
				cat_number = cat_number + 1;
			}else if(split_str[i].equals(MOUSE)){
				mouse_number = mouse_number + 1;
			}
		}
		//数の比較
		if (cat_number > mouse_number) {
			System.out.println("catのほうが多い");
		}else if(cat_number < mouse_number) {
			System.out.println("mouseのほうが多い");
		}else {
			System.out.println("catとmouseは同じ数");
		}
	}

}
