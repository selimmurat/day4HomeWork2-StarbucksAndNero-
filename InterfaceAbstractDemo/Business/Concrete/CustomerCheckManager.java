package Concrete;

import Abstract.Customer;
import Abstract.ICustomerCheckService;
import Adapters.KimlikDogrulamaServiceAdapter;

public class CustomerCheckManager implements ICustomerCheckService {

	// Burası kendi servicemiz. Test ortamında çalışmak istenildiğinde kendi servicemiz çağrılabilir.
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true ; 
	}

	
}
