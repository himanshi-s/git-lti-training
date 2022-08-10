package Testing;

public class Measurement {

	private int value;
	
	public Measurement (int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void add (Measurement m) {
		value= value + m.getValue();
	}
	
	public void sub(Measurement m) {
		value= value-m.getValue();
	}
}
