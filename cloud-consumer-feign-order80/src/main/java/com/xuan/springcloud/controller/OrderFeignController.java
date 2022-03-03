package com.xuan.springcloud.controller;

import com.xuan.springcloud.api.PaymentFeignApi;
import com.xuan.springcloud.entity.CommonResult;
import com.xuan.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignApi paymentFeignApi;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignApi.getPaymentById(id);
    }
}
