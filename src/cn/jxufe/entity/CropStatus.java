package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

@Entity
@Table(name="T_CropStatus")
public class CropStatus extends EntityID {
	private String cropStatus;

	public String getCropStatus() {
		return cropStatus;
	}

	public void setCropStatus(String cropStatus) {
		this.cropStatus = cropStatus;
	}
	

}
