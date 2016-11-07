package org.walmart.demo.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/item")
public class ItemResource {
	@Inject
	ItemService is;
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getMessage(){
		
		return is.fetchItems();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Item createItem(Item item){
		return is.create(item);
	}
}
