package com.wlp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
//maxInactiveIntervalInSeconds不要重复配置，否则可能达不到设定时间
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 10)
public class RedisConfig {

    @Value("${redis.hostname}")
    private String hostName ;

    @Value("${redis.port}")
    private int port;

    @Bean
    public JedisConnectionFactory connectionFactory(){
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration(this.hostName, this.port);
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(redisConfig);
        return  connectionFactory;
    }

}
