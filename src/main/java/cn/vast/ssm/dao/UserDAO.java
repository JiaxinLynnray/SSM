package cn.vast.ssm.dao;

import cn.vast.ssm.entity.User;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 22:51
 */
public interface UserDAO {
    /**
     * 登录
     *
     * @param user 用户
     *
     * @return
     */
    public User login(User user);
}
