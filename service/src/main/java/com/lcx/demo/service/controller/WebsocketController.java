package com.lcx.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author louchongxiao
 * @since 2019/12/6
 */
@RestController
public class WebsocketController {
    @Autowired
    private SimpMessagingTemplate template;


    @MessageMapping("/chat")
    @SendTo("/subscribe")
    public String say(String msg) {
        System.out.println(String.format("websocket msg: {%s}", msg));
        return msg;
    }

    @GetMapping("/websocket/reply")
    public String msgReply(@RequestParam String msg) {
        System.out.println(String.format("websocket reply: {%S}", msg));
        template.convertAndSend("/subscribe", msg);
        return msg;
    }
}