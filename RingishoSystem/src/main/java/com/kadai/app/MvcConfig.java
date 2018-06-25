package com.kadai.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	/**
    	 * コントローラーとviewをマッピング
    	 * このメソッドに記述していないURLは各コントローラークラスで管理
    	 */
        registry.addViewController("/login").setViewName("/login/login"); //ログインページURL指定
    }
}
