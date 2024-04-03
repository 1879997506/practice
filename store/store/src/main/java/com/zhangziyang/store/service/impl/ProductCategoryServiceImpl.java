package com.zhangziyang.store.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhangziyang.store.model.ProductCategory;
import com.zhangziyang.store.mapper.ProductCategoryMapper;
import com.zhangziyang.store.service.ProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangziyang.store.vo.ProductCategoryVO;
import org.apache.velocity.runtime.log.PrimordialLogSystem;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangziyang
 * @since 2024-02-03
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
     @Override
    public List<ProductCategoryVO> getAllProductCategoryVO(){
         QueryWrapper wrapper = new QueryWrapper();
         wrapper.eq("type",1);
         List<ProductCategory>levelOne = productCategoryMapper.selectList(wrapper);
         List<ProductCategoryVO> levelOneVO = levelOne.stream().map(e-> new ProductCategoryVO(e.getId(),e.getName())).collect(Collectors.toList());
         for(ProductCategoryVO levelOneProductCategoryVO : levelOneVO){
             wrapper = new QueryWrapper();
             wrapper.eq("type",2);
             wrapper.eq("parent_id",levelOneProductCategoryVO.getId());
             List<ProductCategory>levelTwo = productCategoryMapper.selectList(wrapper);
             List<ProductCategoryVO> levelTwoVO = levelTwo.stream().map(e-> new ProductCategoryVO(e.getId(),e.getName())).collect(Collectors.toList());
             levelOneProductCategoryVO.setChildren(levelTwoVO);
             for(ProductCategoryVO levelTwoProductCategoryVO : levelTwoVO){
                 wrapper = new QueryWrapper();
                 wrapper.eq("type",3);
                 wrapper.eq("parent_id",levelTwoProductCategoryVO.getId());
                 List<ProductCategory>levelThree = productCategoryMapper.selectList(wrapper);
                 List<ProductCategoryVO> levelThreeVO = levelThree.stream().map(e-> new ProductCategoryVO(e.getId(),e.getName())).collect(Collectors.toList());
                 levelTwoProductCategoryVO.setChildren(levelThreeVO);


             }
         }
         return levelOneVO;
     }
}
