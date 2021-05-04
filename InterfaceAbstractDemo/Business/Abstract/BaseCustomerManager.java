package Abstract;

import Concrete.CorporateCustomer;
import Concrete.IndividualCustomer;
import Concrete.StudentCustomer;

public abstract class BaseCustomerManager implements ICustomerService {


	@Override
	public void Add(Customer customer) {
		
		if (customer.getClass().getSimpleName().equals("IndividualCustomer")) 
		{
			IndividualCustomer individualCustomer=(IndividualCustomer)customer;			
			System.out.println("Ki�i Veritaban�n kayd� olu�turulmu�tur.Kaydedilen ki�i: " +individualCustomer.getFirstName());	

		} 
		else if (customer.getClass().getSimpleName().equals("StudentCustomer")) 
		{
			StudentCustomer studentCustomer=(StudentCustomer)customer;			
			System.out.println("��renci Ki�i Veritaban�na kayd� olu�turulmu�tur.Kaydedilen ��renci: " +studentCustomer.getFirstName());	
		} 
		else 
		{
			CorporateCustomer corporateCustomer=(CorporateCustomer)customer;
			System.out.println("Kurumsal firma veritaban�na kaydedilmi�tir :  " +corporateCustomer.getCompanyName());	
		}
	}
}
