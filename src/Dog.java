
public class Dog extends Mammal {

	public Dog(String name, int age) {
		super(name,age);
	}
	@Override
	public void saySomeThing() {
		System.out.println("멍멍멍멍");
	}

}
