package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.Customer;
import Abstract.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager   {
	
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.Add(customer);
		}
		else
		{
			System.out.println("Kimlik doðrulama baþarýz kaydetme iþlemi yapýlamamýþtýr.");
		}
		
	}	

}
