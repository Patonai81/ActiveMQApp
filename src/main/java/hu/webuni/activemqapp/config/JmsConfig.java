package hu.webuni.activemqapp.config;

import org.apache.activemq.broker.BrokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfig {

    @Bean
    public BrokerService configBroker() throws Exception{
        BrokerService brokerService = new BrokerService();
        brokerService.addConnector("tcp://localhost:9998");
        brokerService.setPersistent(false);
        return brokerService;
    }
}
