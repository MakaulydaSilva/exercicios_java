package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, char iC, Integer numberOfEmployees) {
		super(name, anualIncome, iC);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		
		if (numberOfEmployees > 10) {
			sum += super.getAnualIncome() / 100 * 14;

		} else {
			sum += super.getAnualIncome() / 100 * 16;
		}

		return sum;
	}

}
