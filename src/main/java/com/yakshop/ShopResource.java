package com.yakshop;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yakshop.model.Herd;
import com.yakshop.service.InventoryService;

@Path("/shopinfo")
public class ShopResource {

	InventoryService inventory;

	@GET
	@Path("hello")
	public String sayHello() {
		System.out.println("Hi we are here to learn rest web service");
		return "received ping on " + new Date().toString();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("initShop/{day}")
	public Response storeShopInfo(Herd herdInfo, @PathParam("day") int day) {
		inventory = new InventoryService();
		return Response.status(200).entity(inventory.getShopInfo(herdInfo, day)).build();
	}
}
