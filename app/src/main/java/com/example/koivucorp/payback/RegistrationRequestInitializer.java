package com.example.koivucorp.payback;

public class RegistrationRequestInitializer extends com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer {

    public RegistrationRequestInitializer() {
        super();
    }

    public RegistrationRequestInitializer(String key) {
        super(key);
    }

    public RegistrationRequestInitializer(String key, String userIp) {
        super(key, userIp);
    }

    @Override
    public final void initializeJsonRequest(com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<?> request) throws java.io.IOException {
        super.initializeJsonRequest(request);
        initializeRegistrationRequest((RegistrationRequest<?>) request);
    }

    protected void initializeRegistrationRequest(RegistrationRequest<?> request) throws java.io.IOException {
    }
}
