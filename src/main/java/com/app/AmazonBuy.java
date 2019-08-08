package com.app;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/amazon")
public class AmazonBuy {
	@GET
	@Path("/tx")
	@Produces("application/json")
	public TxInfo getOne() {
		TxInfo t = new TxInfo();
		t.setTxId(101);
		t.setCode("cooler");
		t.setCost(5000);
		return t ;

	}
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<TxInfo> getAll() {
		TxInfo t = new TxInfo();
		List<TxInfo> list=Arrays.asList(
				new TxInfo(102,"ac",15000),
				new TxInfo(103,"car",515000),
				new TxInfo(104,"plane",115000)
				);
		return list; 

	}
}
