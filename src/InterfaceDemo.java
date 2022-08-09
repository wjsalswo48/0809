
public interface InterfaceDemo {
	public static void main(String[] args) {
		Datable d = new Dated();
		d.set(Datable.TUE);
		System.out.println(d.get());
	}
}
