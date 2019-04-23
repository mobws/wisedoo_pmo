package com.wisedoo.bd.dao;

import com.wisedoo.bd.dataobject.UserDO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface UserDOMapper {

    int deleteByPrimaryKey(String pkUser);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(String pkUser);

    ArrayList<UserDO> selectAllUser();

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}