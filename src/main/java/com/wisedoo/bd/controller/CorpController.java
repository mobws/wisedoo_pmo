package com.wisedoo.bd.controller;

import com.wisedoo.base.response.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: CorpController
 * @Description: 公司Controller
 * @Auther: liujn
 * @Date: 2019/4/23 5:36 PM
 * @Version 1.0
 */
@Controller("corp")
@RequestMapping("/corp")
public class CorpController {

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

    @RequestMapping(value = "/adCorp", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType addCorp(){

        return CommonReturnType.create(null);
    }

}
