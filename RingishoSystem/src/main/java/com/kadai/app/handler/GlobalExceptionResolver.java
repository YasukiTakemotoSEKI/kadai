package com.kadai.app.handler;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionResolver implements HandlerExceptionResolver {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);
    
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex) {
        logger.error("例外をキャッチしました。", ex);
        ModelAndView mav = new ModelAndView();
        // templateに表示するメッセージをセットします。
        mav.addObject("message", "予期せぬエラーが発生しました。" +
                        " 詳細：【" + ex + "】");
        // 遷移先のtemplateを指定します。(errorに遷移します。)
        mav.setViewName("/error/error");
        return mav;
    }
}
