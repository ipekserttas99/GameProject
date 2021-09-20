package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private int discount;
	private int campaignDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getCampaignDate() {
		return campaignDate;
	}
	public void setCampaignDate(int campaignDate) {
		this.campaignDate = campaignDate;
	}
	
	
}
