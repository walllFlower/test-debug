package com.yonyoucloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Myapp {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		System.out.println(11111);
		return "hello,spring boot application! baby";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Myapp.class, args);

	}

}

