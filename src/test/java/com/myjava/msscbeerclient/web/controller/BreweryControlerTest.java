package com.myjava.msscbeerclient.web.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myjava.msscbeerclient.web.client.BreweryClient;
import com.myjava.msscbeerclient.web.model.BeerDto;

@SpringBootTest
class BreweryControlerTest {

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

}
