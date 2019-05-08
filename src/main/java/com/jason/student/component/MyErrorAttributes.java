package com.jason.student.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * @author jason
 * @date 2019-05-08  18:18:35
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(requestAttributes, includeStackTrace);
        Map<String, Object> etx = (Map<String, Object> )requestAttributes.getAttribute("etx",0);
        map.put("company","jason");
        map.put("etx",etx);
        return map;
    }
}
