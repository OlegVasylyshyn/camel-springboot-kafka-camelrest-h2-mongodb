package com.dexter.camel.bean;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
    public void process(Exchange e){
        System.err.println(e);
    }
}
