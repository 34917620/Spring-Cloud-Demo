package com.smart.facade;

import com.smart.vo.ReturnData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: 王智
 * @DATE: 2022/12/20 14:55
 **/
@FeignClient(value = "Ms01")
public interface TestFacade {

    @GetMapping("ms/showName")
    public ReturnData<String> check();
}
