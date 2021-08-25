package com.how2java.tmall.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 这里我们的CORSConfiguration配置类继承了WebMvcConfigurer父类并且重写了addCorsMappings方法，我们来简单介绍下我们的配置信息
 * allowedOrigins：允许设置的请求域名访问我们的跨域资源，可以固定单条或者多条内容，如："http://www.baidu.com"，只有百度可以访问我们的跨域资源。
 * addMapping：配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径。
 * allowedMethods：设置允许的请求方法类型访问该跨域资源服务器，如：POST、GET、PUT、OPTIONS、DELETE等。
 * allowedHeaders：允许所有的请求header访问，可以自定义设置任意请求头信息，如："X-YYYY-TOKEN"
 * allowCredentials： 是否允许请求带有验证信息,用户是否可以发送、处理 cookie
 */

public class CORSConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")//项目中的所有接口都支持跨域
                .allowedOrigins("*")//所有地址都可以访问，也可以配置具体地址
                .allowedMethods("*")//"GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS"
                .allowedHeaders("*");// 跨域允许时间
    }
}
