package Controller;

import Model.ModelFacade;

public interface ControllerFactory {

	/**
	 * 
	 * @param strategy
	 * @param modelFacade
	 */
	RentController createController(RentalStrategy strategy, ModelFacade modelFacade);

}