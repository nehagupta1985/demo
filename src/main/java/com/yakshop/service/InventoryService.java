package com.yakshop.service;

import com.yakshop.core.bean.ShopResponse;
import com.yakshop.core.bean.StoreShopInfo;
import com.yakshop.model.Herd;
import com.yakshop.model.Labyak;

public class InventoryService {

	public StoreShopInfo getShopInfo(Herd herdInfo, int day) {
		StoreShopInfo shopInfo = new StoreShopInfo();
		shopInfo.setDay(day);
		shopInfo.setShopInfo(prepareShopInventory(herdInfo, day));
		return shopInfo;
	}

	private ShopResponse prepareShopInventory(Herd herdInfo, int day) {
		ShopResponse inventory = null;
		if (null != herdInfo) {
			inventory = new ShopResponse();
			inventory.setShopInfo(herdInfo);
			inventory.setTotalMilk(prepareTotalMilk(day, herdInfo));
			inventory.setTotalSkin(prepareTotalSkin(day, herdInfo));
		}
		return inventory;
	}

	private double prepareTotalMilk(int day, Herd herdInfo) {
		double totalMilk = 0;
		for (int i = 0; i <= day; i++) {
			for (Labyak yak : herdInfo.getLabyaks()) {
				int age = Integer.parseInt(yak.getAge()) * 100 + day;
				if (age / 100 < 10) {
					totalMilk = totalMilk + (50 - (age * 0.03));
				}
			}
		}
		return totalMilk;
	}

	private int prepareTotalSkin(int day, Herd herdInfo) {
		int totalSkin = 0;
		if (day == 0) {
			totalSkin = totalSkin + herdInfo.getLabyaks().size();
		} else {
			for (int i = 1; i <= day; i++) {
				for (Labyak yak : herdInfo.getLabyaks()) {
					int age = Integer.parseInt(yak.getAge()) * 100;
					if ((8 + age * 0.01) % day == 0) {
						totalSkin++;
					}
				}
			}
		}
		return totalSkin;
	}
}
