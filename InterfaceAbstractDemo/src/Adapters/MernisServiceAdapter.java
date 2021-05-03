package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		 
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
					Boolean result = false;
			        try {
						result = kpsPublicSoapProxy.TCKimlikNoDogrula(
						Long.parseLong(customer.getNationalityId()),
						customer.getFirstName().toUpperCase(),
						customer.getLastName().toUpperCase(),
						customer.getDateOfBirth()
						);
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						result = false;
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						result = false;
					}
					
					return result; 
			
	    
	    
	}

	

}
