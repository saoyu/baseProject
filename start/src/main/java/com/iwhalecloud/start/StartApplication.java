package com.iwhalecloud.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author leeshoayu
 * @date 2019/8/22
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.iwhalecloud.client","com.iwhalecloud.server"})
@EnableSwagger2
@MapperScan(basePackages = {"com.iwhalecloud.server.dao.mapper.generator","com.iwhalecloud.server.dao.mapper"})
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
