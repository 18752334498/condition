package com.yucong;

import com.yucong.service.CmdService;
import com.yucong.service.NumberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConditionApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConditionApp.class, args);
        CmdService cmd = (CmdService) context.getBean("cmdService");
        cmd.print();

        NumberService number = (NumberService) context.getBean("numberService");
        number.print();
    }

}
