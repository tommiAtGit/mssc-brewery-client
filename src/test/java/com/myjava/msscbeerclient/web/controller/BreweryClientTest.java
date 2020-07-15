package com.myjava.msscbeerclient.web.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myjava.msscbeerclient.web.client.BreweryClient;
import com.myjava.msscbeerclient.web.model.BeerDto;

@SpringBootTest
class BreweryClientTest {

	@Autowired
	BreweryClient client;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getBeerById() {
		BeerDto dto = client.getBeerById(UUID.randomUUID());
		
		assertNotNull(dto);
	}
	@Test
	void saveNewBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("Lapinkulta").build();
		
		URI uri = client.saveNewBeer(beerDto);
		
		assertNotNull(uri);
		
		System.out.println("****" + uri.toString() + " *****");
	}
	@Test
	void updateBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("New Karhu").build();
		
		client.updateBeer(UUID.randomUUID(), beerDto);
	}
	
	@Test
	void deleteBeer(){
		client.deleteBeer(UUID.randomUUID());
	}
}
