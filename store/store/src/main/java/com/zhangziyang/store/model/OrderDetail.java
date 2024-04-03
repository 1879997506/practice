package com.zhangziyang.store.model;

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
    public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private Integer orderId;

    private Integer productId;

    private Integer quantity;

    private Double cost;


}
