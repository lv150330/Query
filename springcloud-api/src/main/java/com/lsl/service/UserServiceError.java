package com.lsl.service;

import com.lsl.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceError implements UserServiceFeign {
    public void test() {

    }

    public List<User> selectUserList() {
        System.out.println("");
        return null;
    }
}
