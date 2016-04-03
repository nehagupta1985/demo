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

import com.yakshop.core.bean.StoreShopInfo;
import com.yakshop.model.Herd;

@Path("/shopinfo")
public class ShopResource {

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
		StoreShopInfo shopInfo = null;
		
		return Response.status(200).entity(shopInfo).build();
	}
}
