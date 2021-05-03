package Concrete;

import Abstract.CustomerCheckService;

import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		return true;
		
		
		
	}

}
