package com.cctv.dubboapi.controller;


import com.cctv.dubboapi.domain.OrderDomain;
import com.cctv.dubboapi.result.RpcResult;

/**
 * @author 封心
 */
public interface OrderDubboService {
  /**
   * 获取订单接口
   * @return
   */
  RpcResult<OrderDomain> getOrder();

}
