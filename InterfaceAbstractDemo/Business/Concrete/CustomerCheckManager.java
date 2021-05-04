package Concrete;

import Abstract.Customer;
import Abstract.ICustomerCheckService;
import Adapters.KimlikDogrulamaServiceAdapter;

public class CustomerCheckManager implements ICustomerCheckService {

	// Burasý kendi servicemiz. Test ortamýnda çalýþmak istenildiðinde kendi servicemiz çaðrýlabilir.
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true ; 
	}

	
}
