package Concrete;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSellService{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adl� kullan�c�, " + game.getGameName() + " adl� oyunu " + 
				campaign.getCampaignName() + " adl� kampanyadan " + campaign.getDiscount() + " % indirimle sat�n ald�.");
		
	}

}
