package vn.com.databoy.handle.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.com.databoy.handle.BusinessException;
import vn.com.databoy.utils.URLUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

//@Controller
//@ControllerAdvice
public class ExceptionHandlerController {
//    public static final String FORWARD_ERROR = "forward:/error";
//    public static final String VIEW_ERROR = "common.error.page";
//    public static final String WARNING_FLG = "warningFlg";
//    public static final String ERROR_CD = "errorCode";
//    public static final String ERROR_TITLE = "errorTitle";
//    public static final String ERROR_CONTENT = "errorContent";
//    @Autowired
//    private MessageSource msg;
//    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);
//
//    public ExceptionHandlerController() {
//    }
//
//    @RequestMapping({"/error"})
//    public ModelAndView handleError500(HttpServletRequest request, Locale locale) {
//        boolean warningFlg = (Boolean)request.getAttribute("warningFlg");
//        String errorCd = String.valueOf(request.getAttribute("errorCode"));
//        String errorTitle = String.valueOf(request.getAttribute("errorTitle"));
//        String errorContent = String.valueOf(request.getAttribute("errorContent"));
//        ModelAndView mav = this.createContentError(warningFlg, errorCd, errorTitle, errorContent);
//        return mav;
//    }
//
//    @RequestMapping({"/404"})
//    public ModelAndView handleError404(Exception ex, Locale locale) {
//        boolean warningFlg = true;
//        String errorCd = "404";
//        String errorTitle = this.msg.getMessage("error.code.404.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.404.content", (Object[])null, locale);
//        ModelAndView mav = this.createContentError(warningFlg, errorCd, errorTitle, errorContent);
//        return mav;
//    }
//
//    @RequestMapping({"/500"})
//    public String handleError500(Exception ex, Locale locale, HttpServletRequest request) {
//        boolean warningFlg = false;
//        String errorCd = "500";
//        String errorTitle = this.msg.getMessage("error.code.common.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.content", (Object[])null, locale);
//        request.setAttribute("warningFlg", warningFlg);
//        request.setAttribute("errorCode", errorCd);
//        request.setAttribute("errorTitle", errorTitle);
//        request.setAttribute("errorContent", errorContent);
//        return "forward:/error";
//    }
//
//    @RequestMapping({"/400"})
//    public String handleError400(Exception ex, Locale locale, HttpServletRequest request) {
//        boolean warningFlg = false;
//        String errorCd = "400";
//        String errorTitle = this.msg.getMessage("error.code.common.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.content", (Object[])null, locale);
//        request.setAttribute("warningFlg", warningFlg);
//        request.setAttribute("errorCode", errorCd);
//        request.setAttribute("errorTitle", errorTitle);
//        request.setAttribute("errorContent", errorContent);
//        return "forward:/error";
//    }
//
//    @ExceptionHandler({Exception.class})
//    public ModelAndView responseException(Exception ex, Locale locale, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        logger.debug("Error:Exception: " + ex.toString());
//        boolean warningFlg = true;
//        String errorCd = "101";
//        String errorTitle = this.msg.getMessage("error.code.common.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.content", (Object[])null, locale);
//        ModelAndView mav = this.createContentError(warningFlg, errorCd, errorTitle, errorContent);
//        if (URLUtil.isAjaxRequest(request)) {
//            response.setStatus(400);
//        } else {
//            response.setStatus(200);
//        }
//
//        return mav;
//    }
//
//    @ExceptionHandler({SystemException.class})
//    public String responseSystemException(SystemException ex, HttpServletRequest request, Locale locale) {
//        logger.error("Error:SystemException: " + ex.toString());
//        boolean warningFlg = false;
//        String errorCd = "101";
//        String errorTitle = this.msg.getMessage("error.code.common.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.content", (Object[])null, locale);
//        request.setAttribute("warningFlg", warningFlg);
//        request.setAttribute("errorCode", errorCd);
//        request.setAttribute("errorTitle", errorTitle);
//        request.setAttribute("errorContent", errorContent);
//        return "forward:/error";
//    }
//
//    @ExceptionHandler({BusinessException.class})
//    public String responseDatabaseException(BusinessException ex, HttpServletRequest request, Locale locale) {
//        logger.error("Error:DatabaseException: " + ex.toString());
//        boolean warningFlg = false;
//        String errorCd = "102";
//        String errorTitle = this.msg.getMessage("error.code.common.data.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.data.content", (Object[])null, locale);
//        request.setAttribute("warningFlg", warningFlg);
//        request.setAttribute("errorCode", errorCd);
//        request.setAttribute("errorTitle", errorTitle);
//        request.setAttribute("errorContent", errorContent);
//        return "forward:/error";
//    }
//
//    @RequestMapping(
//            value = {"/accessDenied"},
//            method = {RequestMethod.GET}
//    )
//    public String accessDenied(HttpServletRequest request, HttpServletResponse response, Locale locale) {
//        if (URLUtil.isAjaxRequest(request)) {
//            response.setStatus(400);
//        } else {
//            response.setStatus(200);
//        }
//
//        boolean warningFlg = false;
//        String errorCd = "403";
//        String errorTitle = this.msg.getMessage("error.code.common.data.title", (Object[])null, locale);
//        String errorContent = this.msg.getMessage("error.code.common.data.content", (Object[])null, locale);
//        request.setAttribute("warningFlg", warningFlg);
//        request.setAttribute("errorCode", errorCd);
//        request.setAttribute("errorTitle", errorTitle);
//        request.setAttribute("errorContent", errorContent);
//        return "forward:/error";
//    }
//
//    private ModelAndView createContentError(boolean warningFlg, String errorCd, String errorTitle, String errorContent) {
//        ModelAndView mav = new ModelAndView("common.error.page");
//        mav.addObject("warningFlg", warningFlg);
//        mav.addObject("errorCode", errorCd);
//        mav.addObject("errorTitle", errorTitle);
//        mav.addObject("errorContent", errorContent);
//        return mav;
//    }
}