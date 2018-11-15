package com.geekerit.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @ClassName ZipkinApplication
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/15 17:01
 * @Version 1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
