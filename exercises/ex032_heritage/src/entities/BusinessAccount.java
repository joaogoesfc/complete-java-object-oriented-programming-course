package entities;

public class  BusinessAccount extends Account{
	private double loanLimit;

	

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double loan) {
		if(loan <= loanLimit) {
			balance += loan - 10;
			loanLimit -= loan;
		} else System.out.println("The amount exceeds your limit!");
	}
}
