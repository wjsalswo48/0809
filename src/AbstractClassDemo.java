
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("강아지",20);
		System.out.println(m);
		m.saySomeThing();
		m = new Cat("고양이",30);
		m.saySomeThing();
	}
}