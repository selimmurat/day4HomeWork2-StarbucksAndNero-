package Concrete;

import Abstract.Customer;
import Abstract.ICustomerCheckService;
import Adapters.KimlikDogrulamaServiceAdapter;

public class CustomerCheckManager implements ICustomerCheckService {

	// Buras� kendi servicemiz. Test ortam�nda �al��mak istenildi�inde kendi servicemiz �a�r�labilir.
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true ; 
	}

	
}
