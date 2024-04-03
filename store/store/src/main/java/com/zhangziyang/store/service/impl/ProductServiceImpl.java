package com.zhangziyang.store.service.impl;

import com.zhangziyang.store.model.Product;
import com.zhangziyang.store.mapper.ProductMapper;
import com.zhangziyang.store.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
