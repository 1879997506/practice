package com.zhangziyang.store.service.impl;

import com.zhangziyang.store.model.User;
import com.zhangziyang.store.mapper.UserMapper;
import com.zhangziyang.store.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
