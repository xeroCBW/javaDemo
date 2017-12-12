/**
 * 
 */
package com.cbw.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**   
* @Title: Aspect01.java 
* @Package com.cbw.aspect 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cbw   
* @date 2017年12月12日 下午2:40:31 
* @version V1.0   
*/
@Aspect
@Component
public class Aspect01 {
	
	private final  Logger logger = Logger.getLogger(getClass());
	

	@Pointcut("execution(public * com.cbw.web.controller..*.*(..))")
	public void webLog(){}
	 
	 @Before("webLog()")
	    public void doBefore(JoinPoint joinPoint) throws Throwable {
	        // 接收到请求，记录请求内容
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        HttpServletRequest request = attributes.getRequest();

	        // 记录下请求内容
	        logger.info("URL : " + request.getRequestURL().toString());
	        logger.info("HTTP_METHOD : " + request.getMethod());
	        logger.info("IP : " + request.getRemoteAddr());
	        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
	        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

	    }

	    @AfterReturning(returning = "ret", pointcut = "webLog()")
	    public void doAfterReturning(Object ret) throws Throwable {
	        // 处理完请求，返回内容
	        logger.info("RESPONSE : " + ret);
	    }
	
	

}
