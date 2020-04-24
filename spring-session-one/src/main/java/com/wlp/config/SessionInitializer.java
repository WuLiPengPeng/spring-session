package com.wlp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

@Configuration
public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public SessionInitializer(){
        super(RedisConfig.class);
    }
}
