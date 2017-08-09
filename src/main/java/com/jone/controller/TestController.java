package com.jone.controller;

import com.jone.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 向敬光 on 2017-08-09.
 */
@Controller
//@RequestMapping(value = "/test")
public class TestController extends BaseController {

    @RequestMapping(value = "/test")
    public void test(HttpServletRequest request, HttpServletResponse response){
        try {
            ServletOutputStream out = response.getOutputStream();
            out.write("Hello world".getBytes());
        }catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
