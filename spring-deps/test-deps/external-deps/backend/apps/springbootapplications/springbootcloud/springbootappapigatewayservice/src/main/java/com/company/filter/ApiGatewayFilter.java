package com.company.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ApiGatewayFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("Pre Processing Logic Goes here : {} ", exchange.getRequest());
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            log.info("Post Processing Logic Goes here : {} ", exchange.getResponse());
        }));
    }

    /*
    public static void main(String[] args) {
        String[] strings = {"aab", "aaa", "zdc", "efe", "rte", "kls", "lmn"};
        Set<StringBuffer> stringBufferSet = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            stringBufferSet.add(new StringBuffer(strings[i]));
        }
        System.out.println("TreeSet with StringBuffer: " + stringBufferSet);
    }
    */

}
