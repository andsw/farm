package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

@Entity
@Table(name="T_GrowPhase")
public class GrowPhase   extends EntityID{
	private int seedId;
	private int growStage;
	private String growFlag;
	private int growTime;
	private double insect;
	private int width;
	public int getSeedId() {
		return seedId;
	}
	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}
	public int getGrowStage() {
		return growStage;
	}
	public void setGrowStage(int growStage) {
		this.growStage = growStage;
	}
	public String getGrowFlag() {
		return growFlag;
	}
	public void setGrowFlag(String growFlag) {
		this.growFlag = growFlag;
	}
	public int getGrowTime() {
		return growTime;
	}
	public void setGrowTime(int growTime) {
		this.growTime = growTime;
	}
	public double getInsect() {
		return insect;
	}
	public void setInsect(double insect) {
		this.insect = insect;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getOffsetX() {
		return offsetX;
	}
	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}
	public int getOffsetY() {
		return offsetY;
	}
	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}
	public String getCropStatus() {
		return cropStatus;
	}
	public void setCropStatus(String cropStatus) {
		this.cropStatus = cropStatus;
	}
	private int height;
	private int offsetX;
	private int offsetY;
	private String cropStatus;
	

}
