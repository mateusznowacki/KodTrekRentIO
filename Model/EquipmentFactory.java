package Model;

public interface EquipmentFactory {

	/**
	 * 
	 * @param name
	 * @param description
	 * @param pricePerDay
	 * @param gearCount
	 */
	Equipment createBike(String name, String description, double pricePerDay, int gearCount);

	/**
	 * 
	 * @param name
	 * @param description
	 * @param pricePerDay
	 * @param capacity
	 */
	Equipment createTent(String name, String description, double pricePerDay, int capacity);

	/**
	 * 
	 * @param name
	 * @param description
	 * @param pricePerDay
	 * @param volume
	 */
	Equipment createBackpack(String name, String description, double pricePerDay, int volume);

}