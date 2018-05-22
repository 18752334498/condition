package com.yucong.config;

import com.yucong.condition.EightCondition;
import com.yucong.condition.NineCondition;
import com.yucong.service.EightService;
import com.yucong.service.NineService;
import com.yucong.service.NumberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberConditionConfig {


    @Bean("numberService")
    @Conditional(NineCondition.class) //基于条件的Bean的创建方式
    public NumberService nineCondition(){
        System.out.println("config......nine.....");
        return new NineService();
    }

    @Bean("numberService")
    @Conditional(EightCondition.class) //基于条件的Bean的创建方式
    public NumberService eightCondition(){
        System.out.println("config......eight.....");
        return new EightService();
    }

}
