/**
 * 
 */
package Ex2;

/**
 * @author Johaen
 *
 */
public class BankAccount {

	private int accountNumber;
	private String name;
	private int balance;
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param accountNumber
	 * @param name
	 * @param balance
	 */
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int deposit(int depositAmount) 
	   {      
	      if (depositAmount > 0.0) // if the depositAmount is valid
	      return  balance = balance + depositAmount; // add it to the balance 
	   }

	public int withdraw(int withdrawAmount) 
	   {      
	      if (withdrawAmount > 0.0) // if the withdrawAmount is valid
	      return   balance = balance - withdrawAmount; // Subtract it to the balance 
	   }
    public String getAccountInfo()
    {
    	
    	
    	return String.format("Account Number: %s%nName Of Owner: %s%nBalance: %s%n",this.accountNumber,this.name,this.balance );
    	
    }
    }

