package com.bassolicodes.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.Objects;

public class SendRequest {

    public void getUserGitHub(String username) throws IOException {

        if(username == null || username.isEmpty()) {
            throw new IOException("Username is null or empty");
        }

        OkHttpClient client = new OkHttpClient();

        String url = "https://api.github.com/users/" + username;

        Request request = new Request.Builder().url(url).build();

        try (okhttp3.Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String body = Objects.requireNonNull(response.body()).string();

            System.out.println(body);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void getAllContributionsByUser(String username) throws IOException {
        if(username == null) {
            throw new IOException("Username is null");
        }

        OkHttpClient client = new OkHttpClient();

        String url = "https://api.github.com/users/" + username + "/events/public";

        Request request = new Request.Builder().url(url).build();

        try (okhttp3.Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String body = Objects.requireNonNull(response.body()).string();

            System.out.println(body);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
