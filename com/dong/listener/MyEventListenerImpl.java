package com.dong.listener;

/**
 * @author liudong 2024/4/28
 */
public class MyEventListenerImpl implements MyEventListener {

    @Override
    public void handleMyEvent(MyEvent event) {
        System.out.println("Event received: " + event.getSource());
    }
}
