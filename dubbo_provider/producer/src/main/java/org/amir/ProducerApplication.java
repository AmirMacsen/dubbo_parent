package org.amir;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@Slf4j
@SpringBootApplication
@EnableDubbo
@MapperScan("org.amir.mapper")
public class ProducerApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
