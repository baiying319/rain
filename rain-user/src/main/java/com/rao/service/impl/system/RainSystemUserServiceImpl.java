package com.rao.service.impl.system;

import com.rao.dao.admin.RainSystemUserDao;
import com.rao.pojo.entity.system.RainSystemUser;
import exception.BusinessException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.rao.service.system.RainSystemUserService;
import pojo.vo.user.SystemUserVO;

import javax.annotation.Resource;

/**
 * 系统用户 service 实现
 * @author raojing
 * @date 2019/11/25 23:19
 */
@Service
public class RainSystemUserServiceImpl implements RainSystemUserService {

    @Resource
    private RainSystemUserDao rainSystemUserDao;
    
    @Override
    public SystemUserVO findByAccount(String account) {
        RainSystemUser systemUser = rainSystemUserDao.findByUserNameOrPhone(account);
        if(systemUser != null){
            SystemUserVO systemUserVO = new SystemUserVO();
            BeanUtils.copyProperties(systemUser, systemUserVO);
            return systemUserVO;
        }else{
            throw BusinessException.operate("用户不存在");
        }
    }
    
}
