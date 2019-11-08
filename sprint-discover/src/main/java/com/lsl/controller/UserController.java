package com.lsl.controller;

import com.lsl.model.User;
import com.lsl.service.UserServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserServiceFeign {


    @GetMapping("/test")
    @Override
    public void test() {
        System.out.println("feign消费服务成功。。。");
    }

    @GetMapping("/selectUserList")
    @Override
    public List<User> selectUserList() {
        List<User> list=new ArrayList<>();
        list.add(new User(100,"王祥鑫","中国"));
        list.add(new User(101,"王明祥","河北邯郸"));
        list.add(new User(102,"吕世龙","河北邯郸"));
        return list;
    }
}
