package com.kode19.library.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:/home/rhel/config/config.properties")
public class AppConfiguration {


}
