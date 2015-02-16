package com.example.koivucorp.payback;

public class RegistrationScopes {

    public static final String USERINFO_EMAIL = "https://www.googleapis.com/auth/userinfo.email";

    public static java.util.Set<String> all() {
        java.util.Set<String> set = new java.util.HashSet<String>();
        set.add(USERINFO_EMAIL);
        return java.util.Collections.unmodifiableSet(set);
    }

    private RegistrationScopes() {
    }
}
