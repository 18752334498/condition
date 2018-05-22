package com.yucong.config;

import com.yucong.condition.LinuxCondition;
import com.yucong.condition.WindowCondition;
import com.yucong.service.CmdService;
import com.yucong.service.LinuxCmdService;
import com.yucong.service.WindowCmdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CmdServiceConditionConfig {

/*
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface Conditional {
        Class<? extends Condition>[] value();
    }

    实现了condition接口的类,并且返回的值是 true 的时候,该类会成为 数组 中的一个元素
*/

    @Bean("cmdService")
    @Conditional(WindowCondition.class)
    public CmdService windowCmdService(){
        System.out.println("config......window.....");
        return new WindowCmdService();
    }

    @Bean("cmdService")
    @Conditional(LinuxCondition.class)
    public CmdService linuxCmdService(){
        System.out.println("config......linux.....");
        return new LinuxCmdService();
    }
}
