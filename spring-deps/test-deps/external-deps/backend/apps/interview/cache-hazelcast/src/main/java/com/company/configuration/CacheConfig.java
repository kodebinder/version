package com.company.configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public Config configure() {
        return new Config().setInstanceName("hazlecast-insatnce")
                .addMapConfig(new MapConfig().setName("userCache")
                       // .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                       // .setEvictionPolicy(EvictionPolicy.LRU).setTimeToLiveSeconds(2000)
                );
    }

}