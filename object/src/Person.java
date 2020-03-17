
public class Person {
	//名前
	private String name;
	//nameのgetter
	public String getName() {
		return this.name;
	}
	//年齢
	private int age;
	public void setAge(int age){
		this.age = age;
	}
	static int wallet = 0;

	Person(String name, int age){
		this.name = name;
		this.age = age;

	}
	Person(int price){
		this.wallet = this.wallet + price;

	}


	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "才です。");
		System.out.println( "よろしくお願いいたします。");

	}

}
