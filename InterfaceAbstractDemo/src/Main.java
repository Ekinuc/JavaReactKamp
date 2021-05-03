import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ekin", "Uç", 2004, "11111111111"));
		BaseCustomerManager customerManagerNero = new NeroCustomerManager(new MernisServiceAdapter());
		customerManagerNero.save(new Customer(2, "Engin", "Demiroð", 1985, "28861499108"));
	}

}
