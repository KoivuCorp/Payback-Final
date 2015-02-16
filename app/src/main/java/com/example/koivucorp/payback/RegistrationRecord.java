package com.example.koivucorp.payback;

@SuppressWarnings("javadoc")
public final class RegistrationRecord extends com.google.api.client.json.GenericJson {

    @com.google.api.client.util.Key
    private java.lang.String regId;

    public java.lang.String getRegId() {
        return regId;
    }

    public RegistrationRecord setRegId(java.lang.String regId) {
        this.regId = regId;
        return this;
    }

    @Override
    public RegistrationRecord set(String fieldName, Object value) {
        return (RegistrationRecord) super.set(fieldName, value);
    }

    @Override
    public RegistrationRecord clone() {
        return (RegistrationRecord) super.clone();
    }

}
