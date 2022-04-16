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

	public void processContract(Contract contract, int months, char answer) {
		double basicQuota = contract.getTotalValue() / months;
		int var;
		if (answer == 'S' || answer == 's') {
			var = 0;
			months -= 2;
		} else {
			var = 1;
		}
		for (int i = var; i <= months; i++) {
			
			Date dueDate = addMonths(contract.getDate(), i);

			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);

			contract.getInstallmentsList().add(new Installment(dueDate, fullQuota));
		}
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.MONTH, n);
		return cal.getTime();
	}
}
