package Model;

public interface RentalCostStrategy {

	/**
	 * 
	 * @param days
	 * @param pricePerDay
	 */
	double calculateCost(int days, double pricePerDay);

}