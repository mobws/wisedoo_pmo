package com.wisedoo.bd.dao;

import com.wisedoo.bd.dataobject.UserPasswordDO;

import java.util.ArrayList;

public interface UserPasswordDOMapper {

    int deleteByPrimaryKey(String pkUserPassword);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    UserPasswordDO selectByPrimaryKey(String pkUserPassword);

    ArrayList<UserPasswordDO> selectAllUserPassword();

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}