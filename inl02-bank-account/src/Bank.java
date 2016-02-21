import java.util.ArrayList;

public class Bank {

	private ArrayList<BankAccount> accs;

	public Bank() {
		accs = new ArrayList<BankAccount>();
	}

	public int addAccount(String holderName, long idNr) {
		for (BankAccount a : accs) {
			Customer c = a.getHolder();
			if (c.getName().equals(holderName) && c.getIdNr() == idNr) {
				BankAccount b = new BankAccount(c);
				accs.add(b);
				return b.getAccountNumber();
			}

		}
		BankAccount b = new BankAccount(holderName, idNr);
		accs.add(b);
		return b.getAccountNumber();
	}

	public Customer findHolder(long idNr) {
		for (BankAccount a : accs) {
			Customer c = a.getHolder();
			if (c.getIdNr() == idNr)
				return c;
		}
		return null;
	}

	public boolean removeAccount(int number) {
		for (BankAccount a : accs)
			if (a.getAccountNumber() == number) {
				accs.remove(a);
				return true;
			}
		return false;
	}

	public ArrayList<BankAccount> getAllAccounts(){
		ArrayList<BankAccount> = new ArrayList<BankAccount>();
		
	}
}
