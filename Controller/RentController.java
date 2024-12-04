package Controller;

import Model.Equipment;
import Model.ModelFacade;
import Model.User;

public class RentController {

	private RentalStrategy rentalStrategy;
	private ModelFacade modelFacade;

	/**
	 * 
	 * @param rentalStrategy
	 * @param modelFacade
	 */
	public RentController(RentalStrategy rentalStrategy, ModelFacade modelFacade) {
		// TODO - implement RentController.RentController
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 * @param equipment
	 * @param startDate
	 * @param endDate
	 */
	public void rentOrExtendEquipment(User user, Equipment equipment, java.util.Date startDate, java.util.Date endDate) {
		// TODO - implement RentController.rentOrExtendEquipment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param equipmentId
	 * @param days
	 */
	public void rentEquipment(int equipmentId, int days) {
		// TODO - implement RentController.rentEquipment
		throw new UnsupportedOperationException();
	}

}