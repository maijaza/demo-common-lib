package kkk.example.servicecommon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commonlib.demo.Demo;

@RestController
public class ServiceController {
	
	@GetMapping("/")
	public String getData() {
		Demo d = new Demo();
		return d.getString("AAA");
	}

}
