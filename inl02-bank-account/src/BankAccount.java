
public class BankAccount {
	private Customer holder;
	private double balance;
	private int accNr;

	private static int nextAccNr = 0;

	public BankAccount(String holderName, long holderId) {
		holder = new Customer(holderName, holderId);
		balance = 0;
		accNr = nextAccNr++;
	}

	public BankAccount(Customer holder) {
		this.holder = holder;
		balance = 0;
		accNr = nextAccNr++;
	}

	public Customer getHolder() {
		return holder;
	}

	public int getAccountNumber() {
		return accNr;
	}

	public double getAmount() {
		return balance;
	}

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	public String toString() {
		return "Account id: " + accNr + ", holder: " + holder;
	}
}
