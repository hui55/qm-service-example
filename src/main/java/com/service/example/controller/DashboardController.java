package com.service.example.controller;

import com.service.example.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈辉[of2547]
 *         company qianmi.com
 *         Date    2018/8/17
 */
@RestController
@Api(tags = "dashboard控制器")
@RequestMapping(value = "/api")
public class DashboardController {


    @ApiOperation(value = "获取用户列表", notes = "根据User对象创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true),
            @ApiImplicitParam(name = "age", value = "年龄")
    })
    @ApiResponses({
            @ApiResponse(code = 500, message = "你好，我是一个服务器异常"),
            @ApiResponse(code = 501, message = "我是楼上的弟弟")
    })
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUserList() {

        return new ArrayList<User>() {
            {
                add(User.builder().name("qianmi").build());
            }
        };
    }
}
