package com.company.listener;

import com.company.constant.ProductConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaProductListener {

    @KafkaListener(topics = ProductConstants.TOPIC_NAME, groupId = ProductConstants.GROUP_ID)
    public void getListener(String data) {
        System.out.println(this.getClass().getSimpleName() + " received data : " + data);
    }
}
