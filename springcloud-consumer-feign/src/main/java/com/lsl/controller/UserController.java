package com.lsl.controller;

import com.lsl.model.User;
import com.lsl.service.UserServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserServiceFeign userServiceFeign;

    @RequestMapping("/test")
    public void test(){
        userServiceFeign.test();
    }
    @RequestMapping("/selectUserList")
    public List<User> selectUserList(HttpServletResponse response) throws IOException {

        List<User> userList=new ArrayList<>();

            if (userList==null){
                response.setContentType("text/json");
                response.setCharacterEncoding("UTF-8");
                PrintWriter printWriter=response.getWriter();
                printWriter.write("网络异常！！！");
                printWriter.flush();
                printWriter.close();
            }
        return userServiceFeign.selectUserList();
    }
}
