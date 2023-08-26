package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;

import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			List<TaxPayer> list = new ArrayList<>();

			System.out.print("Enter the number of tax payers: ");
			int n = sc.nextInt();

			try {
				for (int i = 1; i <= n; i++) {
					System.out.println("Tax payer #" + i + " data:");
					System.out.print("Individual or company (i/c)? ");
					char iC = sc.next().charAt(0);

					if (iC != 'c' && iC != 'i') {
						throw new RuntimeException();

					}

					System.out.print("Name: ");
					String name = sc.next();
					sc.nextLine();
					System.out.print("Anual Income: ");
					double anualIncome = sc.nextDouble();

					if (iC == 'i') {
						System.out.print("Health expenditures: ");
						double healthExpends = sc.nextDouble();
						list.add(new Individual(name, anualIncome, iC, healthExpends));

					} else if (iC == 'c') {
						System.out.print("Number of employees: ");
						int numberOfEmployee = sc.nextInt();
						list.add(new Company(name, anualIncome, iC, numberOfEmployee));
					}

				}

				System.out.println();
				System.out.println("TAX PAID: ");

				for (TaxPayer tax : list) {
					System.out.println(tax.getName() + ", : $ " + String.format("%.2f", tax.tax()));
				}

				System.out.println();

				double sum = 0.0;
				for (TaxPayer tax : list) {
					sum += tax.tax();
				}

				System.out.printf("TOTAL TAXES: $ %.2f", sum);

			} catch (RuntimeException e) {
				System.out.println("Unexpected error, please retry the program.");
			}

			sc.close();
		}
	}

}
