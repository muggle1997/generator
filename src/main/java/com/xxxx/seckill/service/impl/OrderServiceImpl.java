package com.xxxx.seckill.service.impl;

import com.xxxx.seckill.pojo.Order;
import com.xxxx.seckill.mapper.OrderMapper;
import com.xxxx.seckill.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author muggle
 * @since 2021-07-29
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
