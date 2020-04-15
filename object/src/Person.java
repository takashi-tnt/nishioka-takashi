
public class Person {
	//名前
	private String name;
	//年齢
	private int age;
	//nameのgetter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	//ageのsetter
	public void setAge(int age){
		this.age = age;
	}
	//静的フィールドの生成
	static int wallet = 0;
	//コンストラクタ、nameとage
	Person(String name, int age){
		this.name = name;
		this.age = age;

	}
	//コンストラクタ、静的フィールド
	Person(int price){
		this.wallet = this.wallet + price;
	}
	Person(){

	}

	//myProfileメソッドの定義
	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "才です。");
		System.out.println( "よろしくお願いします。");

	}

}
