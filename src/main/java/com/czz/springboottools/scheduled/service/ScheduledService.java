package com.czz.springboottools.scheduled.service;

import org.springframework.stereotype.Service;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-23 19:34
 */
@Service
public class ScheduledService {
    /**
     * the second(秒) as well as minute(分钟), hour（小时）, day of month（月）, month and day of week（周几）
     * {@code "0 * * * * MON-FRI"}
     */
//    @Scheduled(cron = "0 * * * * 0-7")
//    @Scheduled(cron = "1,2,3,4,5 * * * * *")
//    @Scheduled(cron = "0-4 * * * * *")
//    @Scheduled(cron = "0/4 * * * * *")
    public void hello(){
        System.out.println("hello....");
    }
}
