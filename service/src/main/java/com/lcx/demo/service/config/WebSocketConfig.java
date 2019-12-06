package com.lcx.demo.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * <p>
 * </p>
 *
 * @author louchongxiao
 * @since 2019/12/6
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //客户端连接端点
        registry.addEndpoint("/websocket")
                .setAllowedOrigins("*")
                .withSockJS();
    }

}