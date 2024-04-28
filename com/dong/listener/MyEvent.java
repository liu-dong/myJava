package com.dong.listener;

/**
 * @author liudong 2024/4/28
 */
public class MyEvent {

    private Object source;

    public MyEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }
}
