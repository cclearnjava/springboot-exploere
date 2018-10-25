package com.springboot.cc1springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * http://localhost:8080/book/hello 请求网站地址
 * https://localhost:8080/book/hello  会报错
 *
 */
@SpringBootApplication
public class Cc1SpringbootQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cc1SpringbootQuickstartApplication.class, args);
	}
}
