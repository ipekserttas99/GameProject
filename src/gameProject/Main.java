package gameProject;

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User ipek = new User();
		ipek.setId(1);
		ipek.setFirstName("Ýpek");
		ipek.setLastName("Serttaþ");
		ipek.setNationalityId(000000000L);
		ipek.setDateOfBirth(1999);
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(ipek);
		
		Game pubg = new Game();
		pubg.setId(1);
		pubg.setGameName("PUBG");
		pubg.setCategoryName("Aksiyon");
		pubg.setPrice(200);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Þirket Kampanyasý");
		campaign1.setDiscount(30);
		campaign1.setCampaignDate(2022);

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(ipek, pubg, campaign1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(pubg);
		
	}

}
