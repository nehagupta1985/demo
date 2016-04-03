package com.yakshop.core.bean;

import com.yakshop.model.Herd;

public class ShopResponse {

	private Herd shopInfo;
	private double totalMilk;
	private int totalSkin;

	public Herd getShopInfo() {
		return shopInfo;
	}

	public void setShopInfo(Herd shopInfo) {
		this.shopInfo = shopInfo;
	}

	public double getTotalMilk() {
		return totalMilk;
	}

	public void setTotalMilk(double totalMilk) {
		this.totalMilk = totalMilk;
	}

	public int getTotalSkin() {
		return totalSkin;
	}

	public void setTotalSkin(int totalSkin) {
		this.totalSkin = totalSkin;
	}

	
}
