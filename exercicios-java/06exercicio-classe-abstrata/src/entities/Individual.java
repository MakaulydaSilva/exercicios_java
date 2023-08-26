package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, char iC, double healthExpenditures) {
		super(name, anualIncome, iC);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		double sum = 0.0;

		if (super.getAnualIncome() < 20000.00) {
			sum += super.getAnualIncome() / 100 * 15;
		} else {
			sum += super.getAnualIncome() / 100 * 25;
		}

		if (healthExpenditures > 0) {
			sum -= healthExpenditures / 100 * 50;
		}
		return sum;
	}
}
