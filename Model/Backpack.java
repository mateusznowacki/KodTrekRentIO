package Model;

public class Backpack extends Equipment {

	private int volume;

	public Backpack(String name, String description, double pricePerDay, int volume) {
		super(name, description, pricePerDay);
		this.volume = volume;
	}

	public String toString() {
		// TODO - implement Backpack.toString
		throw new UnsupportedOperationException();
	}

}