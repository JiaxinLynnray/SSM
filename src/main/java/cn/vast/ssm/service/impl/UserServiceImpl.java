package cn.vast.ssm.service.impl;

import cn.vast.ssm.dao.UserDAO;
import cn.vast.ssm.entity.User;
import cn.vast.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:02
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public User login(User user) {
        return userDAO.login(user);
    }
}
