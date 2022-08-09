import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random()*6+1);
		System.out.println("rand = "+rand);
		System.out.println("PI = "+PI);
	}
}
