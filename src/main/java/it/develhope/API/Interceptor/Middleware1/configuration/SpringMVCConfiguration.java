package it.develhope.API.Interceptor.Middleware1.configuration;

import it.develhope.API.Interceptor.Middleware1.interceptor.ApiLoggingInterceptor;
import it.develhope.API.Interceptor.Middleware1.interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private ApiLoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(apiLoggingInterceptor);
       registry.addInterceptor(legacyInterceptor);
    }
}
