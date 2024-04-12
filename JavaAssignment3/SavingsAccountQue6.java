package assignment;

public class SavingsAccountQue6 {
	static double annualInterestRate;
	private double savingsBalance;
	private double interest;

	public SavingsAccountQue6(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;

	}

	public SavingsAccountQue6() {

		savingsBalance = 0.0;

	}

	public void calculateMonthlyInterest() {
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = interest + savingsBalance;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccountQue6.annualInterestRate = annualInterestRate / 100;
	}

	@Override
	public String toString() {
		return "SavingsAccount [savingsBalance=" + savingsBalance + ", interest=" + interest + "]";
	}

	public static void main(String[] args) {

		SavingsAccountQue6 saver1 = new SavingsAccountQue6(20000);
		saver1.setAnnualInterestRate(3);
		saver1.calculateMonthlyInterest();
		System.out.println(saver1);
		SavingsAccountQue6 saver2 = new SavingsAccountQue6(30000);
		saver2.setAnnualInterestRate(4);
		saver2.calculateMonthlyInterest();
		System.out.println(saver2);

	}

}



