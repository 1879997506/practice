package com.zhangziyang.store.vo;

import com.zhangziyang.store.model.ProductCategory;
import lombok.Data;

import java.util.List;

@Data
public class ProductCategoryVO {
    private Integer id;
    private  String name;
    private List<ProductCategoryVO> children;

    public ProductCategoryVO(Integer id, String name){
        this.id = id;
        this.name =name;
    }
}
