package com.wlp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/testOne")
public class TestController {

    @RequestMapping("/testSession")
    public Map<String,Object> testSession(HttpServletRequest request){
        //为true代表没有session时，新创建一个
        Map<String,Object> map = new HashMap<>();
        HttpSession session = request.getSession(true);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = (String)session.getAttribute("now");

        if(now==null || now.isEmpty()){
            session.setAttribute("now",sdf.format(new Date()));
        }
        map.put("sessionId",session.getId());
        map.put("now",now);
        System.out.println("oneSessionId: 【"+session.getId()+"】,now:【"+now+"】");
        return map ;
    }
}
