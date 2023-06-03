package com.acep.faq.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.acep.faq.website.dao")
@ServletComponentScan
public class FaqApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaqApplication.class, args);
    }
}
