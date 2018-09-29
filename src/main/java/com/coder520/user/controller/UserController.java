package com.coder520.user.controller;

import com.coder520.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo class
 *
 * @author Capiudor
 * @date 2018/9/29
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/index")
    public String user(){
        User user = new User();
        user.setRealName("肖总");
        user.setMobile("6666666");
        return "user";
    }

}
