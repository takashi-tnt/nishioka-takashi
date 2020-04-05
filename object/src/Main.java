
public class Main{

	public static void main(String[] args) {
		//課題2の出力
		System.out.println("インスタンスを定義してない状態");
		System.out.println(Person.wallet);

		Person hoge1 = new Person(1000);
		System.out.println(hoge1.wallet);
		Person hoge2 = new Person(2000);
		System.out.println(hoge2.wallet);

		System.out.println(hoge1.wallet);
		System.out.println(hoge2.wallet);
		System.out.println(Person.wallet);


		System.out.println();

		//課題5の出力
		Dog dog = new Dog("ポチ", 5, 12.3);
		System.out.println("名前:" + dog.name);
		System.out.println("年齢:" + dog.age + "歳");
		System.out.println("体重:" + dog.weight + "kg");
		dog.run(dog.name);
		dog.sleep();




	}

}
