package com.thuctap_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thuctap_backend.bean.UserBean;
import com.thuctap_backend.service.RegisterService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class RegisterController {
	@Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody UserBean userBean) {
        String result = registerService.register(userBean);

        if (result.equals("EMAIL_EXISTS")) {
            return ResponseEntity.badRequest().body("Email đã tồn tại. Vui lòng dùng email khác.");
        }

        return ResponseEntity.ok("Đăng ký thành công!");
    }
}
