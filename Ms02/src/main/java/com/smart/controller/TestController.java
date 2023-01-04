package com.smart.controller;

import com.smart.facade.TestFacade;
import com.smart.vo.ReturnData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 王智
 * @DATE: 2022/12/20 14:44
 **/
@RestController
@RequestMapping("/ms")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestFacade testFacade;

    @GetMapping("/showName")
    public ReturnData<String> showName(){
        LOGGER.info("Ms02 --方法被调用");
        return ReturnData.success("This is Ms02");
    }

    @GetMapping("/check")
    public ReturnData<String> check(){
        return testFacade.check();
    }
}
