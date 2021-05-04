package Concrete;

import Abstract.Customer;

public class CorporateCustomer extends Customer  {

	// CorporateCustomer class� proje yap�ld�ktan sorna
	// Starbucks ve Nero bizim kurumsal firmalarada art�k hizmet verece�iz.
	// SOLID ' �n O � Open-closed principle yeni �zellik geldi�inde program�n diren�
	// g�stermemesi ad�na bunu eklemi� oldum.
	
	private long mersisNo;
	private String taxNumber;
	private String companyName;

	public CorporateCustomer() {
	}

	public CorporateCustomer(int id, long mersisNo, String taxNumber, String Email, String companyName) {
		super(id, Email);
		this.mersisNo = mersisNo;
		this.taxNumber = taxNumber;
		this.companyName = companyName;
	}

	public long getMersisNo() {
		return mersisNo;
	}

	public void setMersisNo(long mersisNo) {
		this.mersisNo = mersisNo;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
