package com.zhangziyang.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangziyang
 * @since 2024-02-03
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 商品名称
     */
      private String name;

      /**
     * 价格
     */
      private Double price;

    private Integer sale;

    private Integer categoryleveloneId;

    private Integer categoryleveltwoId;


}
