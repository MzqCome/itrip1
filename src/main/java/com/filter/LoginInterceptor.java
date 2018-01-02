package com.filter;


import com.pojo.ItripUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by main on 2017/12/22.
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        ItripUser user = new ItripUser();
        if(user==null){
            System.out.println("no user in LoginInterceptor!!!");
            request.getRequestDispatcher("/WEB-INF/jsp/403.jsp").include(request,response);

            //本次访问被拦截，业务逻辑不继续执行
            return false;
        }


        ffff:
        //返回true代表继续往下执行
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
