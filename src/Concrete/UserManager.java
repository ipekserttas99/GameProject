package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService){
		this.userCheckService=userCheckService;
	}
	
	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " adl� kullan�c� kaydedildi. ");
		}
		else
		{
			System.out.println(user.getFirstName() + " 'n�n kayd� ba�ar�s�z oldu.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� g�ncellendi.");
	}
	
}
