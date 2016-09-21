/**
 * 
 */
package Ex2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Johaen
 *
 */
public class BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Your Account Number:"));
		String patientId = JOptionPane.showInputDialog(null, "Please Enter Your Name:");
		int balance = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Your Balance:"));
		
		
		
		if(JOptionPane.showInputDialog(null, "Would you like to withdraw or deposit:") == "withdraw")
		{
		      int withdrawAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How much would you like to withdraw"));
			
		}
	  
	}

}
