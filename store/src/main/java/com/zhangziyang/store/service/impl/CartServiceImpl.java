package com.zhangziyang.store.service.impl;

import com.zhangziyang.store.model.Cart;
import com.zhangziyang.store.mapper.CartMapper;
import com.zhangziyang.store.service.CartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

}
