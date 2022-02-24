package com.example.commonlib.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	public String getString(String str) {
		return "Demo " + str;
	}
}
