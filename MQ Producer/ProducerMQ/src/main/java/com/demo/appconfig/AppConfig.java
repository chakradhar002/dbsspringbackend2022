package com.demo.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.demo")
@Import({MessingConfiguration.class})
public class AppConfig {

}
