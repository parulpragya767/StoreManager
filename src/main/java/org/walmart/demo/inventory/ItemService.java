package org.walmart.demo.inventory;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ItemService {
	
	@PersistenceContext(unitName = "StoreManager")
	EntityManager em;
	
	public Item create(Item item){
		em.persist(item);
		return item;
	}
	
	public List<Item> fetchItems(){
		Query query = em.createQuery("Select item from Item item");
		return (List<Item>) query.getResultList();
	}
	 

}
