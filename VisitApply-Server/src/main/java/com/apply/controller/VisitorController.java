package com.apply.controller;


import com.apply.entity.Visitor;
import com.apply.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitor")
@Api(tags = "访问者接口")
public class VisitorController {


    @GetMapping("/info")
    @ApiOperation("登陆回显")
    public Result<Visitor> getVisitorInformation(){

        return Result.success();

    }
}
