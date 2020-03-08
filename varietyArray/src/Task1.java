import java.util.ArrayList;
public class Task1 {

	public static void main(String[] args) {
		// ArrayList生成
		ArrayList<String> japanRegion = new ArrayList<>();
		//地方名入力
		japanRegion.add("北海道");
		japanRegion.add("東北");
		japanRegion.add("関東");
		japanRegion.add("中部");
		japanRegion.add("近畿");
		japanRegion.add("中国");
		japanRegion.add("九州");
		//ループによる出力
		for (String region : japanRegion) {
			System.out.println(region);
		}
	}

}
