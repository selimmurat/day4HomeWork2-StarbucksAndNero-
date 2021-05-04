import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.Customer;
import Adapters.KimlikDogrulamaServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.IndividualCustomer;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Concrete.StudentCustomer;

public class Main {

	public static void main(String[] args) {

		Customer individualCustomer = new IndividualCustomer(1, "DURAK", "DURDU", "durakdurdu@gmail.com",
				new Date(1900, 5, 22), "15425142546");
		Customer studentCustomer = new StudentCustomer(1, "13476002362", "SEL�M", "MURAT", new Date(1988, 8, 22),
				"selim.murat@windowslive.com", "Sel�uk Meslek Y�ksek Okulu", "Bilgisayar Programc�l���");

		BaseCustomerManager starBucks = new StarbucksCustomerManager(new KimlikDogrulamaServiceAdapter());
		starBucks.Add(individualCustomer);
		starBucks.Add(studentCustomer);
		
		BaseCustomerManager nero = new NeroCustomerManager();
		nero.Add(individualCustomer);

	}

}
