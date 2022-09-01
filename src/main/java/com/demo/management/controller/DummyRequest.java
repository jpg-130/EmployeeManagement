package com.demo.management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dummy")
public class DummyRequest {

	@GetMapping(path = "/res", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> response() {
		String responseEntity = "{\"method\": \"GET\", \"api\": \"response\"}";
		return new ResponseEntity<String>(responseEntity, HttpStatus.OK);
	}
}
