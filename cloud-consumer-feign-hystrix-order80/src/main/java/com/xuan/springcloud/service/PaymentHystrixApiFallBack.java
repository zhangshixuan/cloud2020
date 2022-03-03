package com.xuan.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixApiFallBack implements PaymentHystrixApi {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
