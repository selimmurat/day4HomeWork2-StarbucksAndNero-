package Adapters;

import java.rmi.RemoteException;

import Abstract.Customer;
import Abstract.ICustomerCheckService;
import Concrete.CorporateCustomer;
import Concrete.CustomerCheckManager;
import Concrete.IndividualCustomer;
import Concrete.StudentCustomer;
import KimlikDogrulamaService.KPSPublicSoap;
import KimlikDogrulamaService.KPSPublicSoapProxy;

public class KimlikDogrulamaServiceAdapter implements ICustomerCheckService {

	KPSPublicSoapProxy result = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		if (customer.getClass().getSimpleName().equals("IndividualCustomer")) {
			IndividualCustomer individualCustomer = (IndividualCustomer) customer;
			try {
				return result.TCKimlikNoDogrula(Long.parseLong(individualCustomer.getNationalityId()),
						individualCustomer.getFirstName().toUpperCase(), individualCustomer.getLastName().toUpperCase(),
						individualCustomer.getDateOfBirth().getYear());
			} catch (NumberFormatException | RemoteException e) {
				System.out.println("Kimlik bilgileri geçersiz" + e.toString());
			}

		} else if (customer.getClass().getSimpleName().equals("StudentCustomer")) {
			StudentCustomer studentCustomer = (StudentCustomer) customer;
			try {
				return result.TCKimlikNoDogrula(Long.parseLong(studentCustomer.getNationalityId()),
						studentCustomer.getFirstName().toUpperCase(), studentCustomer.getLastName().toUpperCase(),
						studentCustomer.getDateOfBirth().getYear());
			} catch (NumberFormatException | RemoteException e) {
				System.out.println("Kimlik bilgileri geçersiz" + e.toString());
			}
		}
		return false;
	}
}
