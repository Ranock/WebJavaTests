package com.test;

import java.io.IOException;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/socket")
public class WebSocket {
    
    @OnMessage
    public String onMessage(String a, Session s) {
        System.out.println(a);
        return "Chegou";
    }
    
    @OnError
    public void onError(Throwable t) {
        System.out.println(t.getMessage());
        System.out.println("On error Server");
    }
    
    
    @OnOpen
    public void onOpen(Session s) {
        System.out.println("Open session "+s.getId());
        s.getAsyncRemote().sendText("Broadcast");
        for(Session ss : s.getOpenSessions()) {
                ss.getAsyncRemote().sendText("Broadcast");
        }
    }
    
    @OnClose
    public void onClose(CloseReason t) {
//        System.out.println("On Close Server");
    }
}
