package co.nilin.spring.cloud.consulall.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@RefreshScope
@Configuration
@ConfigurationProperties("my")
public class MyProperties {
    private String prop;

    public MyProperties() {
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}

