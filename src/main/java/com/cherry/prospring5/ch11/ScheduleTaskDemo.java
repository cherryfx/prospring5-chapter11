package com.cherry.prospring5.ch11;

import com.cherry.prospring5.ch11.config.AppConfig;
import com.cherry.prospring5.ch11.services.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.io.IOException;

public class ScheduleTaskDemo {
    final static Logger logger = LoggerFactory.getLogger(ScheduleTaskDemo.class);

    public static void main(String[] args) throws InterruptedException, IOException {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        CarService carService = ctx.getBean("carService", CarService.class);
//        while (!carService.isDone()) {
//            logger.info("Waiting for scheduled job to end ...");
//            Thread.sleep(250);
//        }

        System.in.read();

        ctx.close();
    }

}
