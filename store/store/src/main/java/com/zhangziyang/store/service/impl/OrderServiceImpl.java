package com.zhangziyang.store.service.impl;

import com.zhangziyang.store.model.Order;
import com.zhangziyang.store.mapper.OrderMapper;
import com.zhangziyang.store.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangziyang
 * @since 2024-02-03
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
