package com.example.filedemo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.example.filedemo.messaging.ConsumerStateFailureCallback;
import com.simtuitive.core.messaging.service.IConsumerCallback;
import com.simtuitive.core.messaging.service.IConsumerStateCallback;
import com.simtuitive.core.messaging.service.MessagingService;



@Controller
public class InitializationController {
	private static final String NOTIFICATION_TOPIC = "SimtuitiveEmailNotification";
	@Value("${spring.kafka.streams.bootstrap-servers}")
	private String bootstrapServers;
	
	private static MessagingService messagingService;
	
	@PostConstruct
	public void init() throws Exception{		
		//logger.info("Initialing meridian-rest-service");
		//It is the new callback, required from the client.
		IConsumerStateCallback consumerConnFailureCallBack = new ConsumerStateFailureCallback();
		Map<String, IConsumerCallback> callBackTopicMap = new HashMap<>(); 
		messagingService = MessagingService.getMessagingService(bootstrapServers, "Core Service", callBackTopicMap, null, null, consumerConnFailureCallBack);
		
	}
	
	public static MessagingService getMessageService() {
		return messagingService;
	}

}
