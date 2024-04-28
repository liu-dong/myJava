package com.dong.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liudong 2024/4/28
 */
public class MyEventSource {

    private final List<MyEventListener> listeners = new ArrayList<>();

    public void addMyEventListener(MyEventListener listener){
        this.listeners.add(listener);
    }

    public void removeMyEventListener(MyEventListener listener){
        this.listeners.remove(listener);
    }

    public void notifyMyEvent(MyEvent event){
        for(MyEventListener listener : this.listeners){
            listener.handleMyEvent(event);
        }
    }
}
