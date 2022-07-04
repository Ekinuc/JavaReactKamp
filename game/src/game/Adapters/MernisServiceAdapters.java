package game.Adapters;

import java.rmi.RemoteException;

import game.Abstract.GamerCheckService;
import game.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements GamerCheckService{

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			Boolean result = false;
			@Override
			public Boolean checkIfRealPerson(Gamer gamer) {

				KPSPublicSoapProxy client = new KPSPublicSoapProxy();
						Boolean result = false;
				
				try {
					return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
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
	
	
	


