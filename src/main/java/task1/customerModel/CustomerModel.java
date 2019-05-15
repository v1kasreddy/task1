package task1.customerModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection= "CustomerModel")
public class CustomerModel {


    @Id
    public String PN;
    
    public String firstName;
    public String lastName;

    public String emailId;
    public String Address;

    public CustomerModel() {}

    
    
	public CustomerModel(String firstName, String lastName, String PN, String emailId, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.PN = PN;
		this.emailId = emailId;
		Address = address;
	}



	@Override
	public String toString() {
		return "Customer [PN=" + PN + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", Address=" + Address + "]";
	}

////“firstName”:”Test”, 
//“lastName”:”Test”, 
//“phoneNumber”:”1244555555”, 
//“emailId”:”aa@xyz.com”, 
//“Address”:”xxxxxx”, 
//“City”:”xxxxx”, 
//“State”:”xxxxx”, 
//“zipCode”:”xxxx”

}


