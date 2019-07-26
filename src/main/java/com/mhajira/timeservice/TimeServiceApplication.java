package com.mhajira.timeservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class TimeServiceApplication {

	@Value("${server.port}")
	private int port;

	public static void main(String[] args) {
		SpringApplication.run(TimeServiceApplication.class, args);
	}

	@GetMapping
	public String getTime() {
		return " Date and time is:" + new Date().toString() + " return by service running at " + port;
	}
}
