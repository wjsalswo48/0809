
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		String str = Hyman.getinstance();
		//		Hyman jimin = new Human("010-1234-5678","부산시 해운대구 센텀아파트");
//		System.out.println(jimin.toString());
	}
}


abstract class Hyman{
	private String tel;
	private String address;
	private static String str = "Hello World";
	public void Human(String tel, String address) {
		this.tel = tel;
		this.address =address;
	}
	public static String getinstance() {
		return str;
	}
	@Override
	public String toString() {
		return String.format("Hyman [tel=%s, address=%s]", tel, address);
	}
	
}