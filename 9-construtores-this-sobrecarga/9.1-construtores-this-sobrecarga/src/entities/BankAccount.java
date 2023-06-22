package entities;

public class BankAccount {

	private static final double RATE = 5.00;

	private long numberAccount;
	private String cardHolderName;
	private double valueAccount;

	public BankAccount() {
	}

	public BankAccount(long numberAccount, String cardHolderName) {
		this.numberAccount = numberAccount;
		this.cardHolderName = cardHolderName;
	}

	public BankAccount(long numberAccount, String cardHolderName, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.cardHolderName = cardHolderName;
		deposit(initialDeposit);
	}

	public long getNumberAccount() {
		return numberAccount;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public double getValueAccount() {
		return valueAccount;
	}

	public void setValueAccount(double valueAccount) {
		this.valueAccount = valueAccount;
	}

	public void deposit(double amount) {
		valueAccount += amount;
	}

	public void withdraw(double amount) {
		valueAccount -= amount + RATE;
	}

	public String toString() {
		return "Bank Account: [ Account = ID: " + numberAccount + " ], [ Name = " + cardHolderName + " ], [ Amount = $"
				+ valueAccount + " ]";
	}

}
