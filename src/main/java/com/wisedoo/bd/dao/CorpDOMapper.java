package com.wisedoo.bd.dao;

import com.wisedoo.bd.dataobject.CorpDO;

public interface CorpDOMapper {

    int deleteByPrimaryKey(String pkCorp);

    int insert(CorpDO record);

    int insertSelective(CorpDO record);

    CorpDO selectByPrimaryKey(String pkCorp);

    int updateByPrimaryKeySelective(CorpDO record);

    int updateByPrimaryKey(CorpDO record);
}