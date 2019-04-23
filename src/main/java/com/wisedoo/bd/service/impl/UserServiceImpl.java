package com.wisedoo.bd.service.impl;

import com.wisedoo.bd.dao.UserDOMapper;
import com.wisedoo.bd.dao.UserPasswordDOMapper;
import com.wisedoo.bd.dataobject.UserDO;
import com.wisedoo.bd.dataobject.UserPasswordDO;
import com.wisedoo.bd.service.UserService;
import com.wisedoo.bd.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Auther: liujn
 * @Date: 2019/4/12 3:10 PM
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDOMapper userDOMapper;

    @Autowired
    public UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public void getUserById(String pk_user) {

    }


    @Override
    public UserModel getAllUser(){
        ArrayList<UserModel> userModelList = new ArrayList<UserModel>();

        ArrayList<UserDO> userDOList = userDOMapper.selectAllUser();
        ArrayList<UserPasswordDO> userPasswordDO = userPasswordDOMapper.selectAllUserPassword();
        
        BeanUtils.copyProperties(userDOList, userModelList);
        for (UserModel userModel : userModelList){
            String pk_user = userModel.getPkUser();
            

        }

        return null;
    }


}
