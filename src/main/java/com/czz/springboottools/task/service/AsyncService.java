package com.czz.springboottools.task.service;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-23 19:25
 */
@Service
public class AsyncService {

    @Async // 告诉spring 是一个 异步方法
    @SneakyThrows
    public void hello(){
        Thread.sleep(3000);
        System.out.println("hello");
    }
}
