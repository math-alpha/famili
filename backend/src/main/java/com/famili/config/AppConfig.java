package com.famili.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Strongly-typed application configuration.
 * Values are populated from application.yaml or environment variables.
 */
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private Jwt jwt = new Jwt();
    private Admin admin = new Admin();

    public Jwt getJwt() {
        return jwt;
    }

    public void setJwt(Jwt jwt) {
        this.jwt = jwt;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public static class Jwt {
        /** Keep secrets out of source control; set via env var JWT_SECRET */
        private String secret;
        private int expiration = 3600;

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public int getExpiration() {
            return expiration;
        }

        public void setExpiration(int expiration) {
            this.expiration = expiration;
        }
    }

    public static class Admin {
        private String email = "admin@example.com";

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
