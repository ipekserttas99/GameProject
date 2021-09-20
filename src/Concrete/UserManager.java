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
			System.out.println(user.getFirstName() + " adlý kullanýcý kaydedildi. ");
		}
		else
		{
			System.out.println(user.getFirstName() + " 'nýn kaydý baþarýsýz oldu.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý güncellendi.");
	}
	
}
