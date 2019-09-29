package com.wisedoo.bd.controller;

import com.wisedoo.base.controller.BaseController;
import com.wisedoo.base.response.CommonReturnType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: UserController
 * @Description: 用户Controller
 * @Auther: liujn
 * @Date: 2019/4/12 2:53 PM
 * @Version 1.0
 */
@Controller("user")
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/getAllUser", method = {RequestMethod.POST}, consumes = {BaseController.CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType getAllUser(){




        return CommonReturnType.create(null);
    }

}
