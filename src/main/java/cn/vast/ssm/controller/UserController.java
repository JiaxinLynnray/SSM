package cn.vast.ssm.controller;

import cn.vast.ssm.entity.User;
import cn.vast.ssm.service.UserService;
import cn.vast.ssm.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:06
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     * @param request
     *
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        try {
            String pwdMD5 = MD5Util.MD5Encode(user.getPassword(), "UTF-8");
            user.setPassword(pwdMD5);
        } catch (Exception e) {
            user.setPassword("");
        }

        User resultUser = userService.login(user);
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "请认真核对账号、密码！");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/main.jsp";
        }
    }
}
