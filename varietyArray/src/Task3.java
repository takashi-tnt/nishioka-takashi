import java.util.HashMap;
public class Task3 {

	public static void main(String[] args) {
		//HashMap作成、変数名変更
		HashMap<String, Integer> priceList = new HashMap<>();
		priceList.put("りんご", 130);
		priceList.put("メロン", 6000);
		priceList.put("みかん", 120);
		priceList.put("バナナ", 98);

		//変数名変更、拡張for文
		for(HashMap.Entry<String, Integer> priceTag : priceList.entrySet()) {
			System.out.print(priceTag.getKey());
			System.out.print(":");
			System.out.print(priceTag.getValue());
			System.out.println("円");
		}


	}

}
