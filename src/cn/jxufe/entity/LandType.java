package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

@Entity
@Table(name="T_LandType")
public class LandType  extends EntityID{

	private String landType;

	public String getLandType() {
		return landType;
	}

	public void setLandType(String landType) {
		this.landType = landType;
	}
	

}
