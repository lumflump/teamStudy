package com.lguplus.nucube.order.client;


import org.springframework.web.service.annotation.GetExchange;

public interface OrderClient {

    @GetExchange("http://product/hello")
    String getProductSayHello();

}
