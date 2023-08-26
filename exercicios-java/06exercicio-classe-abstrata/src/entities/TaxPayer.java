package entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;
	private char iC;

	public TaxPayer() {

	}

	public TaxPayer(String name, Double anualIncome, char iC) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
		this.iC = iC;
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

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public char getiC() {
		return iC;
	}

	public void setiC(char iC) {
		this.iC = iC;
	}
	
	public abstract double tax();

}
