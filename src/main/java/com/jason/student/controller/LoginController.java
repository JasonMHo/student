package com.jason.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author jason
 * @date 2019-05-07  10:40:19
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session){
        if(!StringUtils.isEmpty(userName) && "123456".equals(password)){
            session.setAttribute("loginUser", userName);
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名密码错误！");
            return "login";
        }

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginUser");
        session.invalidate();
        return "redirect:/";
    }
}
