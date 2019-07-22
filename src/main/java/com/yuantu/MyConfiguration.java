package com.yuantu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author
 * @description
 * @date
 * @see
 * @since
 */
@Configuration
public class MyConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurerAdapter() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // springboot 2.0 实现跨域请求
                // 设置允许跨域的路径
                registry.addMapping("/**")
                        // 设置允许跨域请求的域名
                        .allowedOrigins("*")
                        // 是否允许证书 不再默认开启
                        .allowCredentials(true)
                        // 设置允许的方法
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        // 跨域允许时间
                        .maxAge(3600);
            }

        };

    }
}