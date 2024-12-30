package com.emailservice.email_service.jmslistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.basedomains.base_domains.dto.OrderEvent;


@Component
public class EmailQueueListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailQueueListener.class);

    @JmsListener(destination = "email-queue")
    public void processEmailQueue(OrderEvent orderEvent) {
        LOGGER.info(String.format("Email Service Sending Notification ==> %s", orderEvent.toString()));

        // Send email notifications
    }
}
