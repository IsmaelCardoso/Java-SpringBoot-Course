package entities;

public class Individual extends Contributors{

	private Double healthyCats;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthyCats) {
		super(name, annualIncome);
		this.healthyCats = healthyCats;
	}

	public Double getHealthyCats() {
		return healthyCats;
	}

	public void setHealthyCats(Double healthyCats) {
		this.healthyCats = healthyCats;
	}

	@Override
	public double tax() {
		double taxCalc = (getAnnualIncome() < 20000.00) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
		taxCalc -= getHealthyCats() * 0.5;
		if (taxCalc < 0) {
			taxCalc = 0.0;
		}
		
		return taxCalc;
	}
}
