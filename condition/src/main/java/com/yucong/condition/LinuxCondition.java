package com.yucong.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

    /**
     * 返回true的时候,LinuxCondition这个类才会存在
     * 通过@Conditional来判断这个类是否存在
     * 如果存在就会做一些配置
     *
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println("condition......linux.....");
        return context.getEnvironment().getProperty("os.name").contains("Linux");
    }
}
