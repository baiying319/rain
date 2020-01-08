package com.rao.component;

import com.rao.pojo.bo.UserLoginLogoutLogBO;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : hudelin
 * @className :LogInLogoutProducer
 * @description : 登录登出生产者
 * @date: 2019-12-31 10:59
 */
@Component
public class LoginLogoutProducer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMsg(UserLoginLogoutLogBO userLoginLogoutLogBO) {
        rocketMQTemplate.convertAndSend("LoginLogout", userLoginLogoutLogBO);
    }

}
