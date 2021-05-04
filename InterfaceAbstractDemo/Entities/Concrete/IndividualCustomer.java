package Concrete;

import java.util.Date;

import Abstract.Customer;

public class IndividualCustomer extends Customer {

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String NationalityId;

	public IndividualCustomer() {
	}

	public IndividualCustomer(int id, String firstName, String lastName, String Email, Date dateOfBirth,
			String nationalityId) {

		super(id, Email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
