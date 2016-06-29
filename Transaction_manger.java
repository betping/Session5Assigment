
public class Transaction_manger {

	public Transaction_manger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Bank_Account BET=new Bank_Account();
	   BET.deposit(1000);
	   Bank_Account david=new Bank_Account();
	   david.deposit(2000);
	//do a transfer...
	  BET.Transfer(1000, david);
	  //check that transfer was OK...
	  System.out.println(BET.getBamlance());
	  System.out.println(david.getBamlance());
		
		
		
		
		

	}

}
