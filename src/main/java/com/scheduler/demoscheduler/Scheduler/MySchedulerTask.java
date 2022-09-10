package com.scheduler.demoscheduler.Scheduler;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
// @EnableAsync //fixedRate
public class MySchedulerTask {
    
    // @Scheduled(fixedDelay = 1000, initialDelay = 2000) // Menyelesaikan eksekusi sebelumnya sampai selesai terlebih dahulu
    // @Async //fixedRate
    // @Scheduled(fixedRate = 1000) // langsung eksekusi task selanjutnya tanpa menunggu task sebelumnya selesai
    @Scheduled(cron = "0 * * ? * *")
    public void myFirstTask(){
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Task executed at: "+ fmt.format(System.currentTimeMillis()));
        // Thread.sleep(10000); //fixedRate
    }
}
