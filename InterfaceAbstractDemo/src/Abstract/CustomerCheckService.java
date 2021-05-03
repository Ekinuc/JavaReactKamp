package Abstract;



import Entities.Customer;

public interface CustomerCheckService {
	Boolean checkIfRealPerson(Customer customer);
}
