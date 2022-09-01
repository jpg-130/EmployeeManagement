package com.demo.management.controller;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.management.dto.AddressDTO;
import com.demo.management.dto.EmployeeDTO;

@RestController
@RequestMapping(path = "/dummy")
public class DummyRequest {

	@GetMapping(path = "/res", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> response() {
		String responseEntity = "{\"method\": \"GET\", \"api\": \"response\"}";
		return new ResponseEntity<String>(responseEntity, HttpStatus.OK);
	}

	@GetMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeDTO> getDummyEmployee() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setAddressId(0);
		addressDTO.setAddressLine1("line1");
		addressDTO.setAddressLine2("line2");
		addressDTO.setCity("Dummy City");
		addressDTO.setContactNumber("9999999999");
		addressDTO.setPinCode("444444");
		employeeDTO.setEmployeeEmail("dummy@email.com");
		employeeDTO.setEmployeeId(0);
		employeeDTO.setFirstName("Dummy");
		employeeDTO.setLastName("Employee");
		employeeDTO.setAddressDTOs(Set.of(addressDTO));
		return new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
	}

	@PostMapping(path = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> postDummyEmployee(@RequestBody EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO);
		return new ResponseEntity<Boolean>(HttpStatus.CREATED);
	}
}
