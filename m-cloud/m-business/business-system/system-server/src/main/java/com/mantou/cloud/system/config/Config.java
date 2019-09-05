package com.mantou.cloud.system.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class Config {

    //@Value(value = "${test}")
    private String str;

    public void test() {
        log.info(str);
    }
}
