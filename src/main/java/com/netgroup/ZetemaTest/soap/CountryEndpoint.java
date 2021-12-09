package com.netgroup.ZetemaTest.soap;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetShopRequest;
import io.spring.guides.gs_producing_web_service.GetShopResponse;



@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	public CountryEndpoint(ShopRepository shopRepository) {
		this.shopRepository = shopRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getShopRequest")
	@ResponsePayload
	public GetShopResponse getCountry(@RequestPayload GetShopRequest request) {
		GetShopResponse response = new GetShopResponse();
		response.setShop(shopRepository.findShop(request.getName()));
		return response;
	}
}
