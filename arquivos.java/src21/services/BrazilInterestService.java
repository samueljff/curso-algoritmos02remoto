package services;

public class BrazilInterestService implements InterestService  {

	private Double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
		
	@Override
	public double getIterestRate() {
		return interestRate;
	}
}
