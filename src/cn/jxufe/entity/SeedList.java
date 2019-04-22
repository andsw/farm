package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

@Entity
@Table(name="T_SeedList")
public class SeedList  extends EntityID {
	
	private int seedId;
	private String seedName;
	private int seedSeason;
	private int seedLevel;
	private String seedType;
	private int experience;
	private int maurityTime;
	private int harvest;
	private int seedPrice;
	private int fruitPrice;
	private String land;
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}
	public String getSeedName() {
		return seedName;
	}
	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}
	public int getSeedSeason() {
		return seedSeason;
	}
	public void setSeedSeason(int seedSeason) {
		this.seedSeason = seedSeason;
	}
	public int getSeedLevel() {
		return seedLevel;
	}
	public void setSeedLevel(int seedLevel) {
		this.seedLevel = seedLevel;
	}
	public String getSeedType() {
		return seedType;
	}
	public void setSeedType(String seedType) {
		this.seedType = seedType;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getMaurityTime() {
		return maurityTime;
	}
	public void setMaurityTime(int maurityTime) {
		this.maurityTime = maurityTime;
	}
	public int getHarvest() {
		return harvest;
	}
	public void setHarvest(int harvest) {
		this.harvest = harvest;
	}
	public int getSeedPrice() {
		return seedPrice;
	}
	public void setSeedPrice(int seedPrice) {
		this.seedPrice = seedPrice;
	}
	public int getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(int fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public int getSeasonGrade() {
		return seasonGrade;
	}
	public void setSeasonGrade(int seasonGrade) {
		this.seasonGrade = seasonGrade;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	private int seasonGrade;
	private String prompt;
	

}
