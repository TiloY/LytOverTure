package com.lyt.lyt.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringContextHolder {

    @Autowired
    private static ApplicationContext context;

    public static void setApplicationContext(ApplicationContext context) throws BeansException {
        if (SpringContextHolder.context == null) {
            SpringContextHolder.context = context;
        }
    }
    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return context;
    }

    //通过name获取 Bean.
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);

    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}