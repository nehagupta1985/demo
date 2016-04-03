package com.yakshop.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.yakshop.ShopResource;
import com.yakshop.service.InventoryService;

@ApplicationPath("/shop")
public class ApplicationConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> resources = new HashSet<>();

		System.out.println("REST configuration starting: getClasses()");
		resources.add(ShopResource.class);
		resources.add(InventoryService.class);
		// resources.add(CustomerResource.class);
		System.out.println("REST configuration ended successfully.");
		return resources;
	}

	@Override
	public Set<Object> getSingletons() {
		return Collections.emptySet();
	}
}
