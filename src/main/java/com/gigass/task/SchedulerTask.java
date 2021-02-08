package com.gigass.task;

import com.gigass.controller.FiddlerController;
import com.gigass.service.FiddlerService;
import com.gigass.util.SendmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    @Autowired
    private FiddlerService fiddlerService;

    private int count = 0;

//    /**
//     * @Author yzc
//     * @Description 设置每6秒执行一次
//     * @Date 14:23 2019/1/24
//     * @Param
//     * @return void
//     **/
//    @Scheduled(cron = "*/5 * * * * ?")
//    private void process(){
//        fiddlerService.getAllFiddlerInfo(null);
//    }

}
