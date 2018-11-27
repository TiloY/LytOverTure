package com.lyt.lyt.controller;




import com.lyt.lyt.mapper.kaas.KassNaytMapper;
import com.lyt.lyt.mapper.knet.KnetNaytMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
//@PropertySource("application.yml")
//@ConfigurationProperties(prefix = "person")
public class QuickCntroller {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @Autowired
    private KnetNaytMapper knetNaytMapper;
    @Autowired
    private KassNaytMapper kassNaytMapper;

    @RequestMapping("/quick")
    public String quick(){
        int count = knetNaytMapper.getSysTime();
        Date time = kassNaytMapper.getSysTime();
        return "springboot 访问成功!  ;name="+name +";age="+age +";count="+count +";time="+time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "QuickCntroller{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


