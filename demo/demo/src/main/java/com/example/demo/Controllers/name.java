package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	  @Value("${studentName}")
      private String name;
      @GetMapping("name")
      public String getName() {
			return "welcome "+name+" !";
			}
}
