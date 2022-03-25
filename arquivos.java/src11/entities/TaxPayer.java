package entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIcome) {
		this.name = name;
		this.anualIncome = anualIcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIcome) {
		this.anualIncome = anualIcome;
	}
	
	public abstract double tax();

}
