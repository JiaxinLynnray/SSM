package cn.vast.ssm.service;

import cn.vast.ssm.entity.User;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:01
 */
public interface UserService {
    /**
     * 登录
     *
     * @param user
     *
     * @return
     */
    public User login(User user);
}
