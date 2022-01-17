package com.macy.config;

import static util.Constant.EXCHANGE;
import static util.Constant.QUEUE_JSON;
import static util.Constant.QUEUE_XML;
import static util.Constant.ROUTING_JSON_KEY;
import static util.Constant.ROUTING_XML_KEY;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.Jackson2XmlMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerMessageConfig {

	@Autowired
    private ConnectionFactory connectionFactory;
	
	@Bean
	public Queue queueJson() {

		return new Queue(QUEUE_JSON, true);
	}

	@Bean
	public TopicExchange exchange() {

		return new TopicExchange(EXCHANGE);
	}
	
	@Bean
	public Queue queueXml() {

		return new Queue(QUEUE_XML, true);
	}

	@Bean
	public Binding bindingJson(TopicExchange exchange) {

		return BindingBuilder.bind(queueJson()).to(exchange).with(ROUTING_JSON_KEY);
	}

	@Bean
	public Binding bindingXml(TopicExchange exchange) {

		return BindingBuilder.bind(queueXml()).to(exchange).with(ROUTING_XML_KEY);
	}

	
	@Bean
	public RabbitAdmin getRabbitAdmin() {

		return new RabbitAdmin(connectionFactory);
		
	}
	
	@Bean
	public MessageConverter converterJson() {

		return new Jackson2JsonMessageConverter();
	}

	
	@Bean
	public MessageConverter converterXml() {

		return new Jackson2XmlMessageConverter();
	}
	
	@Bean
	public ModelMapper getModelMapper() {

		return new ModelMapper();
	}

	
	@Bean
	public AmqpTemplate templatXml(ConnectionFactory connectionFactory) {

		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(converterXml());
		rabbitTemplate.setDefaultReceiveQueue(QUEUE_XML);
		rabbitTemplate.setRoutingKey(ROUTING_XML_KEY);

		return rabbitTemplate;
	}
	
	@Bean
	public AmqpTemplate templateJson(ConnectionFactory connectionFactory) {

		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(converterJson());
		rabbitTemplate.setDefaultReceiveQueue(QUEUE_JSON);
		rabbitTemplate.setRoutingKey(ROUTING_JSON_KEY);

		return rabbitTemplate;
	}
}
