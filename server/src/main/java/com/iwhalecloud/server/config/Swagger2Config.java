package com.iwhalecloud.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.ztesoft.zsmart.nros.base.config.SwaggerConfig;
/**
 *  swagger配置类
 * @author leeshoayu
 * @date 2019/8/20
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.iwhalecloud.start.controller" )
public class Swagger2Config extends SwaggerConfig {

    /**
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.iwhalecloud.start.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("天青色等烟雨，而我在等你")
                .description("Swagger在线测试")
                .contact("tel:18373213021")
                .version("1.0")
                .build();
    }
}
