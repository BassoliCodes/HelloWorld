package com.bassolicodes;

import okhttp3.*;
import java.io.IOException;

public class Main {

    private final OkHttpClient httpClient = new OkHttpClient();
    public static void main(String[] args) throws IOException {
        sendHelloWorldTo("Lucca Bassoli");

        Main main = new Main();

        main.sendRequest("https://api.github.com/users/BassoliCodes");
    }

    public static void sendHelloWorldTo(String name) {
        System.out.println("Hello " + name + "!");
    }

    public void sendRequest(String urlRequest) throws IOException {
        System.out.println("Sending request...");

        Request request = new Request.Builder().url(urlRequest).build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String body = response.body().string();

            System.out.println(body);
        }

    }
}