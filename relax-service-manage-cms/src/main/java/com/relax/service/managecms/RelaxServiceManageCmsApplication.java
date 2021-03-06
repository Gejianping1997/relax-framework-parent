package com.relax.service.managecms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 16:31
 */
@EnableSwagger2
@SpringBootApplication
@EntityScan("com.relax.framework.domain.cms")
@ComponentScan(basePackages = {"com.relax.service.api"})
@ComponentScan(basePackages = {"com.relax.service.managecms"})
@ComponentScan(basePackages="com.relax.framework")
public class RelaxServiceManageCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelaxServiceManageCmsApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
