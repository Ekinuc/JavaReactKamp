package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.CustomerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.CustomerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.CustomerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
