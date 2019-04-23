package com.wisedoo.bd.service.impl;

import com.wisedoo.base.error.BusinessException;
import com.wisedoo.base.error.EmBusinessError;
import com.wisedoo.bd.dao.CorpDOMapper;
import com.wisedoo.bd.dataobject.CorpDO;
import com.wisedoo.bd.service.CorpService;
import com.wisedoo.bd.service.model.CorpModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

/**
 * @ClassName: CorpServiceImpl
 * @Description: 公司相关接口实现类
 * @Auther: liujn
 * @Date: 2019/4/23 5:07 PM
 * @Version 1.0
 */
public class CorpServiceImpl implements CorpService {

    @Autowired
    private CorpDOMapper corpDOMapper;

    @Override
    public void addCorp(CorpModel corpModel) throws BusinessException {
        if (corpModel == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        // corpModel 转换为 corpDO
        CorpDO corpDO = converFromModel(corpModel);
        try {
            corpDOMapper.insertSelective(corpDO);
        } catch (DuplicateKeyException ex) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "公司编码重复！");
        }
    }

    /**
     * @Author: liujn
     * @Description: model 转换 do
     * @Date: 2019/4/23 5:23 PM
     * @Param: [corpModel]
     * @Return: com.wisedoo.bd.dataobject.CorpDO
     **/
    private CorpDO converFromModel(CorpModel corpModel) {
        if(corpModel == null)
            return null;
        CorpDO corpDO = new CorpDO();
        BeanUtils.copyProperties(corpModel, corpDO);
        return corpDO;
    }

}
