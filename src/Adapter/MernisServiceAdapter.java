package Adapter;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy();
		
			boolean result = false;
			try {
				result = client.TCKimlikNoDogrula(user.getNationalityId(),
						user.getFirstName().toUpperCase(),
						user.getLastName().toUpperCase(), user.getDateOfBirth());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result==true) {
				System.out.println(user.getFirstName() +" adlý kullanýcýnýn bilgileri doðru.");
			}else {
				System.out.println(user.getFirstName() +" adlý kullanýcýnýn bilgileri yanlýþ.");
			}
			return result;
	}
}
	
