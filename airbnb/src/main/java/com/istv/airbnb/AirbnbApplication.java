package com.istv.airbnb;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class AirbnbApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(AirbnbApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AirbnbApplication.class, args);
    }

    @Autowired
    private KafkaTemplate<String, String> template;

    private final CountDownLatch latch = new CountDownLatch(3);

    @Override
    public void run(String... args) throws Exception {
//        this.template.send("Sujet", "foo1");
//        this.template.send("Sujet", "foo2");
//        this.template.send("Sujet", "foo3");
//        latch.await(60, TimeUnit.SECONDS);
//        logger.info("All Received");
    }

//    @KafkaListener(topics = "Sujet")
//    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
//        logger.info(cr.toString());
//        latch.countDown();
//    }
}
