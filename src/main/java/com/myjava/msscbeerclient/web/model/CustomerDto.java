package com.myjava.msscbeerclient.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

	private UUID id;
	private String firstName;
	private String lastName;
	private String Address;
	private String eMail;
}
