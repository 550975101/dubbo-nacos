package com.cctv.dubboconsumer.controller;

import com.cctv.dubboapi.controller.OrderDubboService;
import com.cctv.dubboapi.result.RpcResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 封心
 */
@RestController
@RequestMapping("/order")
public class OrderConsumerController {

  @Reference
  private OrderDubboService orderDubboService;

  @GetMapping("getOrder")
  public RpcResult getOrder() {
    return orderDubboService.getOrder();
  }

}
