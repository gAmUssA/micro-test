package com.griddynamics.producer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Consumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

  private CountDownLatch latch = new CountDownLatch(1);

/*  public CountDownLatch getLatch() {
    return latch;
  }*/

  @KafkaListener(topics = "${spring.kafka.consumer.topic}")
  public void receive(ConsumerRecord<?, ?> consumerRecord) {
    LOGGER.info("received payload='{}'", consumerRecord.toString());
    latch.countDown();
  }

}
