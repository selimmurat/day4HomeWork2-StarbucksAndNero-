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
			System.out.println("Kiþi Veritabanýn kaydý oluþturulmuþtur.Kaydedilen kiþi: " +individualCustomer.getFirstName());	

		} 
		else if (customer.getClass().getSimpleName().equals("StudentCustomer")) 
		{
			StudentCustomer studentCustomer=(StudentCustomer)customer;			
			System.out.println("Öðrenci Kiþi Veritabanýna kaydý oluþturulmuþtur.Kaydedilen öðrenci: " +studentCustomer.getFirstName());	
		} 
		else 
		{
			CorporateCustomer corporateCustomer=(CorporateCustomer)customer;
			System.out.println("Kurumsal firma veritabanýna kaydedilmiþtir :  " +corporateCustomer.getCompanyName());	
		}
	}
}
