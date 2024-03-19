package com.dongnv.cryptocurrency.bot.Bt;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Scheduled(cron = "*/5 * * * * *")
    private void run(){
        System.out.println(" dddd" + new Date());
    }
    
}
