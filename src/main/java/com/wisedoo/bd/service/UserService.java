package com.wisedoo.bd.service;

import com.wisedoo.bd.service.model.UserModel;

/**
 * @ClassName: UserService
 * @Description: 用户Server
 * @Auther: liujn
 * @Date: 2019/4/12 3:09 PM
 * @Version 1.0
 */
public interface UserService {

    void getUserById(String pk_user);

    UserModel getAllUser();


}
