package entities;

public class Company extends Contributors{
	
	private Integer employees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double tax() {
		double taxCalc = (employees <= 10) ? getAnnualIncome() * 0.16 : getAnnualIncome() * 0.14;

		return taxCalc;
	}
}
