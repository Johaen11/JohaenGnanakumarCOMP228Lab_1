package Ex3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Johaen
 *
 */
public class GameObjectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int center = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter The Center:"));
		int velocity = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter The Velocity:"));
		String state = JOptionPane.showInputDialog(null, "Please Enter The state:");
		int rotation = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter The Rotation:"));
		
		GameObject GameObject = new GameObject( center, velocity, state,  rotation);
	
	}

}
