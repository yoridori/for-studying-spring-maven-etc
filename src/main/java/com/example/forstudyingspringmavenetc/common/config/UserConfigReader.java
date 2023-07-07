package com.example.forstudyingspringmavenetc.common.config;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class UserConfigReader {
    private final UserConfig  userConfig;
    public UserConfigReader(UserConfig  userConfig) {
        this.userConfig = userConfig;
    }
}
