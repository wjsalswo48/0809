import java.util.Arrays;

public class InterfaceDemo6 {
	public static void main(String[] args) {
		Product ballpen = new Product("Ballpen",200,"모나미");
//		Product another = ballpen;
		Product another = (Product)(ballpen.copy());
	}
}
