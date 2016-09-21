/**
 * 
 */
package Ex3;

/**
 * @author Johaen
 *
 */
public class GameObject {
	
	private int center;
	private int velocity;
	private String state;
	private int rotation;
	
	public int getCenter() {
		return center;
	}

	public int getVelocity() {
		return velocity;
	}

	public String getState() {
		return state;
	}

	public int getRotation() {
		return rotation;
	}

	public GameObject(int center,int velocity, String state,int rotation )
	{
		this.center = center;
		this.velocity = velocity;
		this.state = state;
		this.rotation = rotation;
		
	}
	
	

}
