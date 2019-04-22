package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

@Entity
@Table(name="T_SeedType")
public class SeedType  extends EntityID{

	private String seedType;

	public String getSeedType() {
		return seedType;
	}

	public void setSeedType(String seedType) {
		this.seedType = seedType;
	}

	
}
