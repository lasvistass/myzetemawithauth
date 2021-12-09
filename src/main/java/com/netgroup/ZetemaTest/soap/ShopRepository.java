package com.netgroup.ZetemaTest.soap;



import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.Shop;


@Component
public class ShopRepository {
	private static final Map<String, Shop> shops = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Shop shop1 = new Shop();
		shop1.setName("Standa");
		shop1.setPosition("Roma");
		shop1.setSerial(12354);
		
		shops.put(shop1.getName(), shop1);
		
		
		Shop shop2 = new Shop();
		shop2.setName("Iper");
		shop2.setPosition("Milano");
		shop2.setSerial(548494);
		
		shops.put(shop2.getName(), shop2);
		
		
		
	}

	public Shop findShop(String name) {
		Assert.notNull(name, "The Shop s name must not be null");
		return shops.get(name);
	}
}
