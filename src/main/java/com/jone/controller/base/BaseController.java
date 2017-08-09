package com.jone.controller.base;

import com.alibaba.fastjson.JSON;
import com.jone.entity.Page;
import com.jone.util.PageData;
import com.jone.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/**
 * Created by 向敬光 on 2017-08-09.
 */
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final long serialVersionUID = 6357869213649815390L;
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 得到PageData
     */
    public PageData getPageData() {
        return new PageData(this.getRequest());
    }

    /**
     * 得到ModelAndView
     */
    public ModelAndView getModelAndView() {
        return new ModelAndView();
    }

    /**
     * 得到request对象
     */
    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        return request;
    }

    /**
     * 得到32位的uuid
     * @return
     */
    public String get32UUID() {

        return UuidUtil.get32UUID();
    }

    /**
     * 得到分页列表的信息
     */
    public Page getPage() {

        return new Page();
    }

    public static void logBefore(Logger logger, String interfaceName) {
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(Logger logger) {
        logger.info("end");
        logger.info("");
    }


    public void write(HttpServletResponse response, Object result){
        response.setContentType("application/json" + ";charset=UTF-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            pw.write(JSON.toJSONString(result));
            pw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (pw != null)
                pw.close();
        }
    }
}
