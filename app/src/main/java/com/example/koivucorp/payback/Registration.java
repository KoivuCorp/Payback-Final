package com.example.koivucorp.payback;

@SuppressWarnings("javadoc")
public class Registration extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

    static {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.19.1 of the registration library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
    }

    public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

    public static final String DEFAULT_SERVICE_PATH = "registration/v1/";

    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    public Registration(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(transport, jsonFactory, httpRequestInitializer));
    }

    Registration(Builder builder) {
        super(builder);
    }

    @Override
    protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
        super.initialize(httpClientRequest);
    }

    public ListDevices listDevices(java.lang.Integer count) throws java.io.IOException {
        ListDevices result = new ListDevices(count);
        initialize(result);
        return result;
    }

    public class ListDevices extends RegistrationRequest<com.example.koivucorp.payback.CollectionResponseRegistrationRecord> {

        private static final String REST_PATH = "registrationrecord/{count}";

        protected ListDevices(java.lang.Integer count) {
            super(Registration.this, "GET", REST_PATH, null, com.example.koivucorp.payback.CollectionResponseRegistrationRecord.class);
            this.count = com.google.api.client.util.Preconditions.checkNotNull(count, "Required parameter count must be specified.");
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
            return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
            return super.buildHttpRequestUsingHead();
        }

        @Override
        public ListDevices setAlt(java.lang.String alt) {
            return (ListDevices) super.setAlt(alt);
        }

        @Override
        public ListDevices setFields(java.lang.String fields) {
            return (ListDevices) super.setFields(fields);
        }

        @Override
        public ListDevices setKey(java.lang.String key) {
            return (ListDevices) super.setKey(key);
        }

        @Override
        public ListDevices setOauthToken(java.lang.String oauthToken) {
            return (ListDevices) super.setOauthToken(oauthToken);
        }

        @Override
        public ListDevices setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (ListDevices) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public ListDevices setQuotaUser(java.lang.String quotaUser) {
            return (ListDevices) super.setQuotaUser(quotaUser);
        }

        @Override
        public ListDevices setUserIp(java.lang.String userIp) {
            return (ListDevices) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private java.lang.Integer count;

        /**

         */
        public java.lang.Integer getCount() {
            return count;
        }

        public ListDevices setCount(java.lang.Integer count) {
            this.count = count;
            return this;
        }

        @Override
        public ListDevices set(String parameterName, Object value) {
            return (ListDevices) super.set(parameterName, value);
        }
    }

    public Register register(java.lang.String regId) throws java.io.IOException {
        Register result = new Register(regId);
        initialize(result);
        return result;
    }

    public class Register extends RegistrationRequest<Void> {

        private static final String REST_PATH = "registerDevice/{regId}";

        protected Register(java.lang.String regId) {
            super(Registration.this, "POST", REST_PATH, null, Void.class);
            this.regId = com.google.api.client.util.Preconditions.checkNotNull(regId, "Required parameter regId must be specified.");
        }

        @Override
        public Register setAlt(java.lang.String alt) {
            return (Register) super.setAlt(alt);
        }

        @Override
        public Register setFields(java.lang.String fields) {
            return (Register) super.setFields(fields);
        }

        @Override
        public Register setKey(java.lang.String key) {
            return (Register) super.setKey(key);
        }

        @Override
        public Register setOauthToken(java.lang.String oauthToken) {
            return (Register) super.setOauthToken(oauthToken);
        }

        @Override
        public Register setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (Register) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Register setQuotaUser(java.lang.String quotaUser) {
            return (Register) super.setQuotaUser(quotaUser);
        }

        @Override
        public Register setUserIp(java.lang.String userIp) {
            return (Register) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private java.lang.String regId;

        /**

         */
        public java.lang.String getRegId() {
            return regId;
        }

        public Register setRegId(java.lang.String regId) {
            this.regId = regId;
            return this;
        }

        @Override
        public Register set(String parameterName, Object value) {
            return (Register) super.set(parameterName, value);
        }
    }

    public Unregister unregister(java.lang.String regId) throws java.io.IOException {
        Unregister result = new Unregister(regId);
        initialize(result);
        return result;
    }

    public class Unregister extends RegistrationRequest<Void> {

        private static final String REST_PATH = "unregisterDevice/{regId}";

        protected Unregister(java.lang.String regId) {
            super(Registration.this, "POST", REST_PATH, null, Void.class);
            this.regId = com.google.api.client.util.Preconditions.checkNotNull(regId, "Required parameter regId must be specified.");
        }

        @Override
        public Unregister setAlt(java.lang.String alt) {
            return (Unregister) super.setAlt(alt);
        }

        @Override
        public Unregister setFields(java.lang.String fields) {
            return (Unregister) super.setFields(fields);
        }

        @Override
        public Unregister setKey(java.lang.String key) {
            return (Unregister) super.setKey(key);
        }

        @Override
        public Unregister setOauthToken(java.lang.String oauthToken) {
            return (Unregister) super.setOauthToken(oauthToken);
        }

        @Override
        public Unregister setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (Unregister) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Unregister setQuotaUser(java.lang.String quotaUser) {
            return (Unregister) super.setQuotaUser(quotaUser);
        }

        @Override
        public Unregister setUserIp(java.lang.String userIp) {
            return (Unregister) super.setUserIp(userIp);
        }

        @com.google.api.client.util.Key
        private java.lang.String regId;

        /**

         */
        public java.lang.String getRegId() {
            return regId;
        }

        public Unregister setRegId(java.lang.String regId) {
            this.regId = regId;
            return this;
        }

        @Override
        public Unregister set(String parameterName, Object value) {
            return (Unregister) super.set(parameterName, value);
        }
    }

    public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

        public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                       com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false);
        }

        @Override
        public Registration build() {
            return new Registration(this);
        }

        @Override
        public Builder setRootUrl(String rootUrl) {
            return (Builder) super.setRootUrl(rootUrl);
        }

        @Override
        public Builder setServicePath(String servicePath) {
            return (Builder) super.setServicePath(servicePath);
        }

        @Override
        public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override
        public Builder setApplicationName(String applicationName) {
            return (Builder) super.setApplicationName(applicationName);
        }

        @Override
        public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
            return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
        }

        @Override
        public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
            return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
        }

        @Override
        public Builder setSuppressAllChecks(boolean suppressAllChecks) {
            return (Builder) super.setSuppressAllChecks(suppressAllChecks);
        }

        public Builder setRegistrationRequestInitializer(
                RegistrationRequestInitializer registrationRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(registrationRequestInitializer);
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }
    }
}
