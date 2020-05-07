package com.relax.service.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 14:32
 */
@SpringBootApplication
@EntityScan("com.relax.framework.model.search")
@ComponentScan(basePackages={"com.relax.service.api"})
@ComponentScan(basePackages={"com.relax.service.search"})
@ComponentScan(basePackages={"com.relax.framework"})
public class RelaxServiceSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelaxServiceSearchApplication.class, args);
    }

}
