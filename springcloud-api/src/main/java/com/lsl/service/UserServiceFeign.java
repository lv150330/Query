package com.lsl.service;

import com.lsl.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "springcloud-discver",fallback = UserServiceError.class)
public interface UserServiceFeign {

    @GetMapping("/test")
    void test();

    @GetMapping("/selectUserList")
    List<User> selectUserList();
}
