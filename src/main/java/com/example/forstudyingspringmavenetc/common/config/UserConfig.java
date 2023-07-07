package com.example.forstudyingspringmavenetc.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "develop")
public class UserConfig {
    private String name;
}
