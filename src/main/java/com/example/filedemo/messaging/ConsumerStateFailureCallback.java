package com.example.filedemo.messaging;

import org.apache.commons.lang3.StringUtils;

import com.simtuitive.core.messaging.service.IConsumerCallback;
import com.simtuitive.core.messaging.service.IConsumerStateCallback;

public class ConsumerStateFailureCallback implements IConsumerStateCallback {
	
	public void onConsumerStateFailure(String topicName,Exception ex) {
		if(StringUtils.isNotBlank(topicName)) {
			System.out.println("It's Fine and Healthy...");
		}else {
			System.out.println("My Health is poor...");
		}
	}

}
