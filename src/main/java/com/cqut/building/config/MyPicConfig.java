package com.cqut.building.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.FileNotFoundException;

@Configuration
public class MyPicConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/**").addResourceLocations("file:F:\\360MoveData\\Users\\Csc\\Desktop\\平时作业\\JavaEE\\student-back\\src\\main\\resources\\static\\");
        try {
            registry.addResourceHandler("/**").addResourceLocations("file:"+ ResourceUtils.getURL("").getPath()+"src/main/resources/static/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //registry.addResourceHandler("/file/**").addResourceLocations("file:F:\\360MoveData\\Users\\Csc\\Desktop\\平时作业\\JavaEE\\student-back\\src\\main\\resources\\file");
    }
}
