package com.tzy.annotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tzy.annotationdemo") //scan the package
public class JavaConfig {


}
