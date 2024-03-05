package com.alilopez.com.models;

public class SMS implements IComunication{
    @Override
    public boolean send(String sms) {
        System.out.println("SMS: " + sms);
        return true;
    }
}
