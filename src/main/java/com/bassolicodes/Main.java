package com.bassolicodes;

public class Main {
    public static void main(String[] args) {
        sendHelloWorld();
        sendHelloWorldTo("Lucca Bassoli");
    }

    public static void sendHelloWorld() {
        System.out.println("Hello world!");
    }

    public static void sendHelloWorldTo(String name) {
        System.out.println("Hello " + name + "!");
    }
}