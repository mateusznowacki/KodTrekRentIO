package Model;

import java.util.ArrayList;

public class ModelFacade {

    private EquipmentFactory sportEquipmentFactory;
    private EquipmentFactory regularEquipmentFactory;
    private RentalFactory regularRentalFactory;
    private RentalFactory discountedRentalFactory;
    private Equipment equipmentList;
    private Rental rentalList;

    /**
     * @param sportEquipmentFactory
     * @param regularEquipmentFactory
     * @param regularRentalFactory
     * @param discountedRentalFactory
     */
    public ModelFacade(EquipmentFactory sportEquipmentFactory, EquipmentFactory regularEquipmentFactory, RentalFactory regularRentalFactory, RentalFactory discountedRentalFactory) {
        // TODO - implement ModelFacade.ModelFacade
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param description
     * @param pricePerDay
     * @param gearCount
     */
    public Equipment createSportBike(String name, String description, double pricePerDay, int gearCount) {
        // TODO - implement ModelFacade.createSportBike
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param description
     * @param pricePerDay
     * @param capacity
     */
    public Equipment createRegularTent(String name, String description, double pricePerDay, int capacity) {
        // TODO - implement ModelFacade.createRegularTent
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param description
     * @param pricePerDay
     * @param volume
     */
    public Equipment createRegularBackpack(String name, String description, double pricePerDay, int volume) {
        // TODO - implement ModelFacade.createRegularBackpack
        throw new UnsupportedOperationException();
    }

    /**
     * @param equipment
     * @param startDate
     * @param endDate
     * @param userId
     */
    public Rental createRegularRental(Equipment equipment, java.util.Date startDate, java.util.Date endDate, int userId) {
        // TODO - implement ModelFacade.createRegularRental
        throw new UnsupportedOperationException();
    }

    /**
     * @param equipment
     * @param startDate
     * @param endDate
     * @param userId
     */
    public Rental createDiscountedRental(Equipment equipment, java.util.Date startDate, java.util.Date endDate, int userId) {
        // TODO - implement ModelFacade.createDiscountedRental
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param description
     * @param pricePerDay
     * @param quantity
     */
    public String addEquipment(String name, String description, double pricePerDay, int quantity) {
        // TODO - implement ModelFacade.addEquipment
        throw new UnsupportedOperationException();
    }

    public java.util.List<Equipment> getAllEquipment() {
        // TODO - implement ModelFacade.getAllEquipment
        throw new UnsupportedOperationException();
    }

    public java.util.List<Equipment> getAvailableEquipment() {
        // TODO - implement ModelFacade.getAvailableEquipment
        throw new UnsupportedOperationException();
    }

    public java.util.List<Rental> getAllRentals() {
        // TODO - implement ModelFacade.getAllRentals
        throw new UnsupportedOperationException();
    }

    /**
     * @param rental
     */
    public void returnEquipment(Rental rental) {
        // TODO - implement ModelFacade.returnEquipment
        throw new UnsupportedOperationException();
    }

    /**
     * @param equipment
     */
    public boolean isEquipmentAvailable(Equipment equipment) {
        // TODO - implement ModelFacade.isEquipmentAvailable
        throw new UnsupportedOperationException();
    }

    /**
     * @param id
     */
    public java.util.List<Rental> getRentalsByUser(int id) {
        // TODO - implement ModelFacade.getRentalsByUser
        throw new UnsupportedOperationException();
    }

    /**
     * @param rental
     */
    public void addRental(Rental rental) {
        // TODO - implement ModelFacade.addRental
        throw new UnsupportedOperationException();
    }

    public Equipment generateRentalId() {
        // TODO - implement ModelFacade.generateRentalId
        throw new UnsupportedOperationException();
    }

    /**
     * @param equipmentId
     */
    public Equipment getEquipmentById(int equipmentId) {
        // TODO - implement ModelFacade.getEquipmentById
        throw new UnsupportedOperationException();
    }

}