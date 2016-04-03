package com.yakshop.core.bean;

import com.yakshop.model.Herd;

public class ShopResponse {

	private Herd shopInfo;
	private float totalMilk;
	private float totalSkin;

	public Herd getShopInfo() {
		return shopInfo;
	}

	public void setShopInfo(Herd shopInfo) {
		this.shopInfo = shopInfo;
	}

	public float getTotalMilk() {
		return totalMilk;
	}

	public void setTotalMilk(float totalMilk) {
		this.totalMilk = totalMilk;
	}

	public float getTotalSkin() {
		return totalSkin;
	}

	public void setTotalSkin(float totalSkin) {
		this.totalSkin = totalSkin;
	}

}
