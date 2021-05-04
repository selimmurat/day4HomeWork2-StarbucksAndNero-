package Concrete;

import Abstract.Customer;

public class CorporateCustomer extends Customer  {

	// CorporateCustomer classý proje yapýldýktan sorna
	// Starbucks ve Nero bizim kurumsal firmalarada artýk hizmet vereceðiz.
	// SOLID ' Ýn O — Open-closed principle yeni özellik geldiðinde programýn direnç
	// göstermemesi adýna bunu eklemiþ oldum.
	
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
