package org.walmart.demo.orderManager.Service;


import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.walmart.demo.orderManager.model.Order;

@Path("/fulfillment/order")
@Produces({ "text/xml", "application/json" })
@Consumes("application/json")
public class OrderService {

	public void placeOrder(@QueryParam("items") String items, @QueryParam("storeId") int storeID){
//		Map<String, Integer> itemQuantities = new HashMap<String, Integer>();
//		Order order =orderDAO.placeOrder(storeID);
//		String[] itemTokens = items.split(",");
//		for (String itemToken : itemTokens) {
//			if (itemToken.isEmpty())
//				continue;
//			Integer quantity = itemQuantities.get(itemToken);
//			if (quantity == null) {
//				itemQuantities.put(itemToken, 1);
//			} else {
//				itemQuantities.put(itemToken, quantity + 1);
//			}
//		}
	}
}

