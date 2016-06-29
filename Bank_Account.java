
public class Bank_Account {

	private static  double balance = 0;
	private double balnce;
	private String accountnum;

	public Bank_Account() {}
	   
	   public void deposit(double amount){
        double balance = 0;
		balance=balance+amount;
	   }
	   public void withdraw(double amount){
		   if(amount<=balance){
		    balance = balance-amount;
	   }else{
		System.out.println("insufficient funds.");
	   }
	}
	  public double getBamlance(){
	   return balance;
	   
	  }
	  
	 public void Transfer(double amount,Bank_Account otherAccount){
		otherAccount.deposit(amount);
		balance=balance-amount;
	  
	}

	public String getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}

	public double getBalnce() {
		return balnce;
	}

	public void setBalnce(double balnce) {
		this.balnce = balnce;
	}

}
