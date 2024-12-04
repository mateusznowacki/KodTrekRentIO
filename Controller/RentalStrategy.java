package Controller;

public interface RentalStrategy {

	/**
	 * 
	 * @param equipmentId
	 * @param days
	 */
	void processRental(int equipmentId, int days);

}