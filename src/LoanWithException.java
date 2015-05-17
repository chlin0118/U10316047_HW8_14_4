public class LoanWithException {
	//Data fields
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public LoanWithException() {
		this(2.5, 1, 1000);
	}

	/** Construct a loan with specified annual interest rate,
	number of years and loan amount */
	public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate and declare exception*/
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if(annualInterestRate > 0){
			this.annualInterestRate = annualInterestRate;
		}
		else{
			//throw exception
			throw new IllegalArgumentException("AnnualInterestRate cannot be negative or zero");
		}
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears and declare exception*/
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if(numberOfYears > 0){
			this.numberOfYears = numberOfYears;
		}
		else{
			//throw exception
			throw new IllegalArgumentException("NumberOfYears cannot be negative or zero");
		}
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a newloanAmount and declare exception*/
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if(loanAmount > 0){
			this.loanAmount = loanAmount;
		}
		else{
			//throw exception
			throw new IllegalArgumentException("LoanAmount cannot be negative or zero");
		}
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	    return monthlyPayment;    
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;    
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}