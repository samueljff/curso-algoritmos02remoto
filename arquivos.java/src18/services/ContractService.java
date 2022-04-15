package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int month) {

		double basicQuota = contract.getTotalValue() / month;
		for(int i = 1; i <= month; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interes(basicQuota, i);
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallmentList().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.MONTH, n);
		return cal.getTime();
	}
}
