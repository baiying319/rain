package com.rao.controller;

import com.rao.service.system.RainSystemUserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.vo.user.SystemUserVO;
import util.result.ResultMessage;

import javax.annotation.Resource;

/**
 * 系统用户
 * @author raojing
 * @date 2019/12/3 9:42
 */
@RestController
@RequestMapping("/system/user")
public class RainSystemUserController {
    
    @Resource
    private RainSystemUserService rainSystemUserService;

    /**
     * 根据账号查询用户信息
     * @param account
     * @return
     */
    @GetMapping("{account}")
    @PreAuthorize("hasAuthority('USER')")
    public ResultMessage<SystemUserVO> findByAccount(@PathVariable("account") String account){
        SystemUserVO systemUserVO = rainSystemUserService.findByAccount(account);
        return ResultMessage.success(systemUserVO);
    }
    
    @GetMapping("test")
    public String test(){
        
        return "hello resource";
    }
    
}
