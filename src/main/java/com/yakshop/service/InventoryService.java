package com.yakshop.service;

import com.yakshop.core.bean.ShopResponse;
import com.yakshop.core.bean.StoreShopInfo;
import com.yakshop.model.Herd;

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
			inventory.setTotalSkin(prepareTotalSkin(day,herdInfo));
		}
		return inventory;
	}
	
	private float prepareTotalMilk(int day, Herd herdInfo){
		return 0;
	}
	
	private float prepareTotalSkin(int day, Herd herdInfo){
		return 0;
	}
}
