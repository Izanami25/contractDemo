package com.example.contractdemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContractDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractDemoApplication.class, args);
    }

}
