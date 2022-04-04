package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private double pricePerDay;
	private double pricePerHour;
	private TaxService taxService;

	public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long ti = carRental.getStart().getTime();
		long tf = carRental.getFinish().getTime();

		double hours = (double) (tf - ti) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
