import java.util.Arrays;

public class Block {
	
	private int previoushash;
	private String [] transactions;
	private int blockhash;
	
	public int getBlockhash() {
		return blockhash;
	}

	public void setBlockhash(int blockhash) {
		this.blockhash = blockhash;
	}

	public Block(int previoushash, String[] transactions) {
		
		this.previoushash = previoushash;
		this.transactions = transactions;
		Object[] contens = {Arrays.hashCode(transactions), previoushash};
		this.blockhash = Arrays.hashCode(contens);
	}

	public int getPrevioushash() {
		return previoushash;
	}

	public void setPrevioushash(int previoushash) {
		this.previoushash = previoushash;
	}

	public String[] getTransactions() {
		return transactions;
	}

	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}
	
	

}
