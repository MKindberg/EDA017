public class Customer {

	private String name;
	private long idNr;
	private int custNr;

	private static int nextCustNr = 0;

	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		custNr = nextCustNr++;
	}

	public String getName() {
		return name;
	}

	public long getIdNr() {
		return idNr;
	}

	public int getCustomerNr() {
		return custNr;
	}

	public String toString() {
		return "Name: " + name + ", id nr: " + idNr + " customer Nr: " + custNr;
	}
}
