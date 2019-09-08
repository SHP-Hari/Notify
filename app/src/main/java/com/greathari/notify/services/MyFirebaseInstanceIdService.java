package com.greathari.notify.services;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIdService extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseIdService";
    private static final String TOPIC_GLOBAL = "global";

    @Override
    public void onNewToken(@NonNull String token) {
        //String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + token);
        FirebaseMessaging.getInstance().subscribeToTopic(TOPIC_GLOBAL);
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(token);

    }

    private void sendRegistrationToServer(String token) {
        Log.d(TAG, "Refreshed token: " + token);
    }
}
