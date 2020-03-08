import java.util.HashMap;
public class Task3 {

	public static void main(String[] args) {
		HashMap<String, Integer> price_list = new HashMap<>();
		price_list.put("りんご", 130);
		price_list.put("メロン", 6000);
		price_list.put("みかん", 120);
		price_list.put("バナナ", 98);

		for(HashMap.Entry<String, Integer> price_tag : price_list.entrySet()) {
			System.out.print(price_tag.getKey());
			System.out.print(":");
			System.out.print(price_tag.getValue());
			System.out.println("円");
		}


	}

}
