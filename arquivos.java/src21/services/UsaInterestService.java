package services;

public class UsaInterestService implements InterestService {

	private Double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
		
	@Override
	public double getIterestRate() {
		return interestRate;
	}
}
