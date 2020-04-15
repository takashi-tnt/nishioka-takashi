
public class Dog extends Animal{
	//重さ
	double weight;
	//コンストラクタ
	public Dog() {};
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//runメソッド
	public void run(String name) {
		System.out.println(name + "は走った");
	}
	//sleepメソッド
	public void sleep() {
		System.out.print(this.name + "は" );
		super.sleep();
	}



}
