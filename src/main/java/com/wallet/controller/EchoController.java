package com.wallet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(String echo) {
        System.out.println("实例2》》》EchoController echo "+echo);
        return "你好！ Nacos Discovery " + echo;
    }

    @RequestMapping(value="/toHello",method=RequestMethod.GET)
    public String toHello() {
        System.out.println("实例2》》》EchoController toHello ");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello feign";
    }
}
