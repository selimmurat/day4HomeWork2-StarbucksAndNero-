package Concrete;


import java.util.Date;

import Abstract.Customer;

public class StudentCustomer extends Customer  {
	

	private String NationalityId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String school;
	private String section;

	public StudentCustomer() {
	}

	public StudentCustomer(int id, String NationalityId, String firstName, String lastName, Date dateOfBirth,
			String Email, String school, String section) {
		super(id, Email);
		this.NationalityId = NationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
		this.dateOfBirth = dateOfBirth;
		this.section = section;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}
