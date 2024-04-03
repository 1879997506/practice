package com.zhangziyang.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone;

      /**
     * 更新时间
     */
      private LocalDateTime updateTime;

      /**
     * 创建时间
     */
        @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 密码
     */
      private String password;


}
