package com.cctv.dubboprovider.service.impl;


import com.cctv.dubboapi.controller.OrderDubboService;
import com.cctv.dubboapi.domain.OrderDomain;
import com.cctv.dubboapi.result.RpcResult;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;

/**
 * @author 封心
 */
@Service
public class OrderDubboServiceImpl implements OrderDubboService {

  @Override
  public RpcResult<OrderDomain> getOrder() {
    return RpcResult.success(new OrderDomain(1, 10086, LocalDateTime.now()));
  }

}
