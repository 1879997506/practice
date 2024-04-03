package com.zhangziyang.store.service;

import com.zhangziyang.store.model.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangziyang.store.vo.ProductCategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangziyang
 * @since 2024-02-03
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    public List<ProductCategoryVO> getAllProductCategoryVO();
}
