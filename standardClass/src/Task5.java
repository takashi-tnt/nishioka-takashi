
public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] split_str =str.split("_") ;

		String cat = "cat";
		String mouse = "mouse";

		int cat_number = 0;
		int mouse_number = 0;

		for(int i = 0; i <= split_str.length-1 ; i ++ ) {
			if (split_str[i].equals(cat)) {
				cat_number = cat_number + 1;
			}else if(split_str[i].equals(mouse)){
				mouse_number = mouse_number + 1;
			}
		}

		if (cat_number > mouse_number) {
			System.out.println("catのほうが多い");
		}else if(cat_number < mouse_number) {
			System.out.println("mouseのほうが多い");
		}else {
			System.out.println("catとmouseは同じ数");
		}
	}

}
