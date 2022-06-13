package com.company.e.config;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCacheConfiguration {

    @Bean
    public Config cacheConfiguration(){
        return new Config().setInstanceName("hazelcast-instance")
                           .addMapConfig(new MapConfig().setName("product-cache")
                                                        .setTimeToLiveSeconds(3000));
    }
}
