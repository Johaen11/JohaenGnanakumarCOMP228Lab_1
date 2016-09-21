/**
 * 
 */
package Ex1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @author Johaen
 *
 */
public class PatientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String patientId = JOptionPane.showInputDialog(null, "Please Enter The PatientId:");
		String firstName = JOptionPane.showInputDialog(null, "Please Enter The First Name:");
		String lastName = JOptionPane.showInputDialog(null, "Please Enter The Last Name:");
		String address = JOptionPane.showInputDialog(null, "Please Enter The Address:");
		String city = JOptionPane.showInputDialog(null, "Please Enter The City:");
		String province = JOptionPane.showInputDialog(null, "Please Enter The Province:");
		String postalcode = JOptionPane.showInputDialog(null, "Please Enter The Postal Code:");
		
		
		Patient patient = new Patient(patientId, firstName, lastName, address, city, province, postalcode );
		
		JOptionPane.showMessageDialog(null, patient.getPatientInfo());

	}

}
