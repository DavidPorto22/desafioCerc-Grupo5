package br.com.cerc.holerite.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApplicationUserEndpoint {
	
	@GetMapping
	public ResponseEntity<?> getAttack() {
		return new ResponseEntity<>("KA-ME-HA-ME-HA", HttpStatus.OK);
	}
}
