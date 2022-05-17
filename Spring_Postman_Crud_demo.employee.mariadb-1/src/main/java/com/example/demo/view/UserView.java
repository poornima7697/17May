package com.example.demo.view;

public class UserView {
    private String firstname;
    private String lastname;
    private String desgination;
    private String aitEmail;
    private long contactNumber;
    
	public UserView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	public String getAitEmail() {
		return aitEmail;
	}

	public void setAitEmail(String aitEmail) {
		this.aitEmail = aitEmail;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public UserView(String firstname, String lastName, String desgination, String aitEmail, long contactNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.desgination = desgination;
		this.aitEmail = aitEmail;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "UserView [firstname=" + firstname + ", lastName=" + lastname + ", desgination=" + desgination
				+ ", aitEmail=" + aitEmail + ", contactNumber=" + contactNumber + "]";
	}
	
}