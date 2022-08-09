
public class Dated implements Datable {
	private int date;
	
	@Override
	public int get() {
		return date;
	}

	@Override
	public void set(int date) {
		this.date = date;
	}
	
}
