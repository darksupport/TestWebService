package com.company;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:8081/ws/calc", new Calculate());
    }
}
