import java.util.ArrayList;

public class main {

	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String [] args){
		
		String[] first_transactions = {"hussam paid hussam 112 bitcoins", "josh paid mark 20 bitcoins" };
		Block firstblock = new Block(0, first_transactions);
		String [] block2transactions = {"hussam paid mark 10 bitcoins"};
		Block block2 = new Block (firstblock.getBlockhash(), block2transactions);
		System.out.println(block2.getBlockhash());
		System.out.println(firstblock.getBlockhash());
		
	}
	
	
	
}
