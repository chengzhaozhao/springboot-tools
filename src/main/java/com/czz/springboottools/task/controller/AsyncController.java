package com.czz.springboottools.task.controller;

import com.czz.springboottools.task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-23 19:27
 */
@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    private String hello(){
        asyncService.hello();
        return "success";
    }
}
