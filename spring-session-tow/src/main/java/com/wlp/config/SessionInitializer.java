package com.wlp.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public SessionInitializer(){
        super(RedisConfig.class);
    }
}
