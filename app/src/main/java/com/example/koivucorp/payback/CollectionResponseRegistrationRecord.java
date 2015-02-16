package com.example.koivucorp.payback;

@SuppressWarnings("javadoc")
public final class CollectionResponseRegistrationRecord extends com.google.api.client.json.GenericJson {

    @com.google.api.client.util.Key
    private java.util.List<RegistrationRecord> items;

    @com.google.api.client.util.Key
    private java.lang.String nextPageToken;

    public java.util.List<RegistrationRecord> getItems() {
        return items;
    }

    public CollectionResponseRegistrationRecord setItems(java.util.List<RegistrationRecord> items) {
        this.items = items;
        return this;
    }

    public java.lang.String getNextPageToken() {
        return nextPageToken;
    }

    public CollectionResponseRegistrationRecord setNextPageToken(java.lang.String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    @Override
    public CollectionResponseRegistrationRecord set(String fieldName, Object value) {
        return (CollectionResponseRegistrationRecord) super.set(fieldName, value);
    }

    @Override
    public CollectionResponseRegistrationRecord clone() {
        return (CollectionResponseRegistrationRecord) super.clone();
    }

}
