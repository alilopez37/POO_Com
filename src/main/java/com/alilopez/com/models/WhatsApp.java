package com.alilopez.com.models;

public class WhatsApp implements IComunication{
    @Override
    public boolean send(String sms) {
        System.out.println("WhastApp: " + sms);
        return true;
    }
}
