package com.tsezarev116;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@ServerEndpoint("/chat")
public class ChatServer {

    private static List<Session> sessionList = Collections.synchronizedList(new ArrayList<Session>());

    private static final Logger LOGGER =
            Logger.getLogger(ChatServer.class.getName());

    @OnOpen
    public void onOpen(Session session) {
        sessionList.add(session);
        System.out.println("New connection with client: " + session.getId());
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        try {
            for (Session s : sessionList) {
                if (s.equals(session)) {
                    continue;
                }
                s.getBasicRemote().sendText(session.getId() + ": " + message);
            }
            System.out.println("New message from Client " + session.getId() + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session.getId() + ": " + message;
    }

    @OnClose
    public void onClose(Session session) {
        sessionList.remove(session);
        System.out.println("Close connection for client: " + session.getId());
    }

    @OnError
    public void onError(Throwable exception, Session session) {
        LOGGER.log(Level.INFO, "Error for client: {0}", session.getId());
    }
}
