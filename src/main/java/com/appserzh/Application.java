package com.appserzh;

import com.appserzh.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;

public final class Application {

    private Application() {}

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
