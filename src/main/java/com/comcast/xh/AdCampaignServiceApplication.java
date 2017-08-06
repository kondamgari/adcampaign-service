package com.comcast.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by skonda004c on 8/5/2017.
 */
@SpringBootApplication
public class AdCampaignServiceApplication {
    public static void main(String [] argv){
        SpringApplication.run(AdCampaignServiceApplication.class, argv);
    }
}
