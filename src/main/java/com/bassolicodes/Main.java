package com.bassolicodes;

import com.bassolicodes.utils.SendRequest;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        sendHelloWorldTo("Lucca Bassoli");

        SendRequest sendRequest = new SendRequest();

        sendRequest.getUserGitHub("BassoliCodes");
        sendRequest.getAllContributionsByUser("BassoliCodes");
    }

    public static void sendHelloWorldTo(String name) {
        System.out.println("Hello " + name + "!");
    }

}