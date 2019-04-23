package com.wisedoo.bd.service;

import com.wisedoo.base.error.BusinessException;
import com.wisedoo.bd.service.model.CorpModel;

/**
 * @ClassName: CorpService
 * @Description: 公司Service
 * @Auther: liujn
 * @Date: 2019/4/23 4:51 PM
 * @Version 1.0
 */
public interface CorpService {

    /**
     * @Author: liujn
     * @Description: 增加公司
     * @Date: 2019/4/23 5:07 PM
     * @Param:
     * @Return:
     **/
    void addCorp(CorpModel corpModel) throws BusinessException;

}
