package Concrete;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSellService{

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adlý kullanýcý, " + game.getGameName() + " adlý oyunu " + 
				campaign.getCampaignName() + " adlý kampanyadan " + campaign.getDiscount() + " % indirimle satýn aldý.");
		
	}

}
