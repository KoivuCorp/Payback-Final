package com.example.koivucorp.payback;

@SuppressWarnings("javadoc")
public abstract class RegistrationRequest<T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

    public RegistrationRequest(
            Registration client, String method, String uriTemplate, Object content, Class<T> responseClass) {
        super(
                client,
                method,
                uriTemplate,
                content,
                responseClass);
    }

    @com.google.api.client.util.Key
    private java.lang.String alt;

    public java.lang.String getAlt() {
        return alt;
    }

    public RegistrationRequest<T> setAlt(java.lang.String alt) {
        this.alt = alt;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String fields;

    public java.lang.String getFields() {
        return fields;
    }

    public RegistrationRequest<T> setFields(java.lang.String fields) {
        this.fields = fields;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String key;

    public java.lang.String getKey() {
        return key;
    }

    public RegistrationRequest<T> setKey(java.lang.String key) {
        this.key = key;
        return this;
    }

    @com.google.api.client.util.Key("oauth_token")
    private java.lang.String oauthToken;

    public java.lang.String getOauthToken() {
        return oauthToken;
    }

    public RegistrationRequest<T> setOauthToken(java.lang.String oauthToken) {
        this.oauthToken = oauthToken;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Boolean prettyPrint;

    public java.lang.Boolean getPrettyPrint() {
        return prettyPrint;
    }

    public RegistrationRequest<T> setPrettyPrint(java.lang.Boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String quotaUser;

    public java.lang.String getQuotaUser() {
        return quotaUser;
    }

    public RegistrationRequest<T> setQuotaUser(java.lang.String quotaUser) {
        this.quotaUser = quotaUser;
        return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String userIp;

    public java.lang.String getUserIp() {
        return userIp;
    }

    public RegistrationRequest<T> setUserIp(java.lang.String userIp) {
        this.userIp = userIp;
        return this;
    }

    @Override
    public final Registration getAbstractGoogleClient() {
        return (Registration) super.getAbstractGoogleClient();
    }

    @Override
    public RegistrationRequest<T> setDisableGZipContent(boolean disableGZipContent) {
        return (RegistrationRequest<T>) super.setDisableGZipContent(disableGZipContent);
    }

    @Override
    public RegistrationRequest<T> setRequestHeaders(com.google.api.client.http.HttpHeaders headers) {
        return (RegistrationRequest<T>) super.setRequestHeaders(headers);
    }

    @Override
    public RegistrationRequest<T> set(String parameterName, Object value) {
        return (RegistrationRequest<T>) super.set(parameterName, value);
    }
}
