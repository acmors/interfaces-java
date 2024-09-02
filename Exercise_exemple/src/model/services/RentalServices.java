package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {
	
	private Double pricerPerHour;
	private Double pricerPerDay;
	
	private BrazilTaxServices taxBrazil;

	public RentalServices(Double pricerPerHour, Double pricerPerDay, BrazilTaxServices taxBrazil) {
		this.pricerPerHour = pricerPerHour;
		this.pricerPerDay = pricerPerDay;
		this.taxBrazil = taxBrazil;
	}
	
	
	public void processInvoice(CarRental carRental) {
		carRental.setInvoice(new Invoice(50.0, 10.0));
	}
	
}
