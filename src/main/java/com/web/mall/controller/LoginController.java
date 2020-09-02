package com.web.mall.controller;

import com.web.mall.api.CommonResult;
import com.web.mall.api.Result;
import com.web.mall.entity.User;
import com.web.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Administrator
 * @date 2020/8/31 9:41
 */

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.getUserByLoginName(username,password);
        if (user == null) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            session.setAttribute("user",user);
            return new Result(200);
        }
    }

}
