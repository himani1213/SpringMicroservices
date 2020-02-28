package com.micro.ibm.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductRestController {
	@Value("${greeting:Hello }")
	private String greeting;

	@GetMapping("/greet")
	public ResponseEntity<String> greeting() {
		ResponseEntity<String> response = ResponseEntity.ok().header("x-ms-header", "XULI").body(greeting);

		return response;
	}

}
