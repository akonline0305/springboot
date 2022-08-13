package com.jdaasjson.jdaasjson;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdaasjsonApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(JdaasjsonApplication.class);
		app.setDefaultProperties(Collections
		.singletonMap("server.port", "8082"));
	    app.run(args);

	}

}
