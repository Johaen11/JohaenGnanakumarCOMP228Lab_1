/**
 * 
 */
package Ex1;

/**
 * @author Johaen
 *
 */
public class Patient {
	
   private String patientId;
   private String firstName;
   private String lastName;
   private String address;
   private String city;
   private String province;
   private String postalCode;
/**
 * @param patientId
 * @param firstName
 * @param lastName
 * @param address
 * @param city
 * @param province
 * @param postalCode
 */
public Patient(String patientId, String firstName, String lastName, String address, String city, String province,
		String postalCode) {
	
	this.patientId = patientId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.city = city;
	this.province = province;
	this.postalCode = postalCode;
}
/**
 * @return the patientId
 */
public String getPatientId() {
	return patientId;
}
/**
 * 
 */
public Patient() 
{

}
/**
 * @param patientId the patientId to set
 */
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the province
 */
public String getProvince() {
	return province;
}
/**
 * @param province the province to set
 */
public void setProvince(String province) {
	this.province = province;
}
/**
 * @return the postalCode
 */
public String getPostalCode() {
	return postalCode;
}
/**
 * @param postalCode the postalCode to set
 */
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

public String getPatientInfo()
{
	String msg = String.format("PatientID: %s%nFirst Name: %s%nLastName: %s%nAddress: %s%nCity %s%nProvince: %s%nPostalCode: %s%n",getPatientId(), getFirstName(), getLastName(), getAddress(), getCity(), getProvince(), getPostalCode());

//	String msg = String.format("PatientID: %s%nFirst"
//			+ "Name: %s%nLastName: %s%nAddress: "
//			+ "%s%City %s%nProvince: %s%nPostalCode", getFirstName(), getLastName(), getAddress(), getCity(), getProvince(), getPostalCode());
		return msg;
}

}
