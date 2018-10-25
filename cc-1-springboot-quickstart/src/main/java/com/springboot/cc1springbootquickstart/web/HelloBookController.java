package com.springboot.cc1springbootquickstart.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName HelloBookController
 * @Author: cc
 * @Descriction:
 * @Date: Created in 5:03 PM 2018/10/25
 * @Modify: by
 */

@RestController
public class HelloBookController {

    @GetMapping(value ="/book/hello")
    public String sayHello(){
        return "hello,cc+springboot";
    }
}
