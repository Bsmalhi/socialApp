package com.happydev.socialApp.config.ymlconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
public class YamlConfig {

    private String name;
    private String profile;
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPort() {
        return port;
    }

    public void setServerName(String port) {
        this.port = port;
    }
}
