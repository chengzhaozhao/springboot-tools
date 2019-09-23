package com.czz.springboottools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // 开启定时任务
@EnableAsync // 开启异步
@SpringBootApplication
public class SpringbootToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootToolsApplication.class, args);
    }

}
