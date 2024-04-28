package com.dong.listener;

/**
 * @author liudong 2024/4/28
 */
public class Test {
    public static void main(String[] args) {

        // 创建事件源
        MyEventSource eventSource = new MyEventSource();

        // 创建监听器
        MyEventListener listener = new MyEventListenerImpl();

        // 注册监听器
        eventSource.addMyEventListener(listener);

        // 触发事件
        eventSource.notifyMyEvent(new MyEvent("Hello, I am Event Source!"));
    }
}
