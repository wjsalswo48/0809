
public class InterfaceDemo2 extends Object implements Father, Mother {

	@Override
	public void grandfather() {
		System.out.println("할아버지가 불러");
	}

	@Override
	public void grandmother() {
		System.out.println("할머니가 불러");
	}

	@Override
	public void mother() {
		System.out.println("엄마가 불러");
	}

	@Override
	public void father() {
		System.out.println("아빠가 불러");
	}
	public static void main(String[] args) {
		GrandFather gfather = new InterfaceDemo2();
		gfather.grandfather();
	}
}
