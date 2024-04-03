package com.zhangziyang.store.model;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
    public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private Integer productId;

    private Integer quantity;

    private Double cost;

    private Integer userId;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
