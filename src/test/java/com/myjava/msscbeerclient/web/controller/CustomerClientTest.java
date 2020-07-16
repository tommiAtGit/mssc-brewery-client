package com.myjava.msscbeerclient.web.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myjava.msscbeerclient.web.client.CustomerClient;
import com.myjava.msscbeerclient.web.model.CustomerDto;

@SpringBootTest
class CustomerClientTest {

	@Autowired
	CustomerClient client; 
	
	@Test
	void getCustomerById() {
		CustomerDto dto = client.getCustomerById(UUID.randomUUID());
		
		assertNotNull(dto);
	}
	@Test
	void saveNewCustomer() {
		CustomerDto dto = CustomerDto.builder().firstName("Portaikko").build();
		
		URI uri = client.saveNewCustomer(dto);
		
		assertNotNull(uri);
		
		System.out.println("****" + uri.toString() + " *****");
	}
	@Test
	void updateCustomer() {
		CustomerDto customerDto = CustomerDto.builder().lastName("Pommi").build();
		
		client.updateCustomer(UUID.randomUUID(), customerDto);
	}
	
	@Test
	void deleteCustomer(){
		client.deleteCustomer(UUID.randomUUID());
	}

}
