package Model;

public class Rental {

	private int idCounter = 0;
	private int id;
	private int userId;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private Equipment equipment;
	private RentalCostStrategy costStrategy;

	public Equipment getEquipment() {
		return this.equipment;
	}

	/**
	 * 
	 * @param equipment
	 * @param startDate
	 * @param endDate
	 * @param costStrategy
	 */
	public Rental(Equipment equipment, java.util.Date startDate, java.util.Date endDate, RentalCostStrategy costStrategy) {
		// TODO - implement Rental.Rental
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param equipment
	 * @param startDate
	 * @param endDate
	 * @param costStrategy
	 * @param userId
	 */
	public Rental(Equipment equipment, java.util.Date startDate, java.util.Date endDate, RentalCostStrategy costStrategy, int userId) {
		// TODO - implement Rental.Rental
		throw new UnsupportedOperationException();
	}

	public double calculateCost() {
		// TODO - implement Rental.calculateCost
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param days
	 */
	public void extendRental(int days) {
		// TODO - implement Rental.extendRental
		throw new UnsupportedOperationException();
	}

	public String getDays() {
		// TODO - implement Rental.getDays
		throw new UnsupportedOperationException();
	}



}