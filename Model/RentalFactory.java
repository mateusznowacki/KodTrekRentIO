package Model;

public interface RentalFactory {

	/**
	 * @param equipment
	 * @param startDate
	 * @param endDate
	 * @param userId
	 * @param costStrategy
	 */
	Rental createRental(Equipment equipment, java.util.Date startDate, java.util.Date endDate, int userId, RentalCostStrategy costStrategy);

}