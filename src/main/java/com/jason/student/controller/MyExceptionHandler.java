package com.jason.student.controller;

import com.jason.student.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jason
 * @date 2019-05-08  17:56:22
 */
@ControllerAdvice
public class MyExceptionHandler {

//    @ExceptionHandler(UserNotExistException.class)
//    @ResponseBody
//    public Map<String, Object> handleMyException(Exception e){
//        Map<String, Object> map = new HashMap<>();
//        map.put("code","user not exist!");
//        map.put("message",e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String  handleMyException2(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user not exist!");
        map.put("message","用户出错了！！！");
        request.setAttribute("etx",map);
        return "forward:/error";
    }
}
