package com.micro.ibm.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ProductController {

	@Autowired
	@Lazy
	EurekaClient eurekaClient;

	@Autowired
	LoadBalancerClient loadBalancerClient;

	@Autowired
	@Lazy
	private RestTemplate restTemplate;

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allinstance")
	public String getAllDiscountedService() {
		String hostinfo = "";
		List<InstanceInfo> list = eurekaClient.getInstancesById("discountms");
		for (InstanceInfo ii : list) {
			hostinfo += ii.getHostName() + " " + ii.getPort() + "\n";
		}
		return hostinfo;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/discoveryInst")
	public String getNextDiscoveryService() {
		ServiceInstance instance = loadBalancerClient.choose("discountms");
		return instance.getHost() + ":" + instance.getPort();
	}

}
