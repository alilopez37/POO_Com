package com.alilopez.com.models;

public class Email implements IComunication{
    @Override
    public boolean send(String sms) {
        System.out.println("Email: " + sms);
        return true;
    }
}
