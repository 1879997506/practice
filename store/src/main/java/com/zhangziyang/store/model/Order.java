package com.zhangziyang.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private Integer userId;

      /**
     * 订单号
     */
      private String serialnumber;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer cost;


}
