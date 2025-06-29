package com.thuctap_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuctap_backend.bean.UserBean;
import com.thuctap_backend.entity.userEntity;
import com.thuctap_backend.jpa.UserJPA;
import com.thuctap_backend.util.PasswordUtil;

@Service
public class RegisterService {
	@Autowired
    private UserJPA userJPA;

    public String register(UserBean userBean) {
    	if (userJPA.existsByEmail(userBean.getEmail())) {
            return "EMAIL_EXISTS";
        }

        userEntity user = new userEntity();
        user.setFullName(userBean.getFullName());
        user.setEmail(userBean.getEmail());
        user.setPasswordHash(PasswordUtil.hashPassword(userBean.getPassword()));
        user.setPhoneNumber(userBean.getPhoneNumber());
        userJPA.save(user);

        return "SUCCESS";
    }
}
