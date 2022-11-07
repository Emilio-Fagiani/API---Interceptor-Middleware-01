package it.develhope.API.Interceptor.Middleware1.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    public boolean preHandler(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.toString().contains("/legacy")){
           response.setStatus(410);
           throw new Exception("this endpoint is blocked");
        }
        return true;
    }
}

