package com.itsmartkit.aop.aspect;

import com.itsmartkit.aop.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cyj
 * @name DemoAspect
 * @description TODO 切面类
 * @date 2019/9/3 14:27
 * Version 1.0
 */

@Slf4j
@Aspect
@Component
public class DemoAspect {

    @Pointcut("within(com.itsmartkit.aop.service..*)")
    public void log() {
    }

    @Pointcut("@annotation(com.itsmartkit.aop.annotation.ResultFiller)")
    public void pointcut() {
    }

    @Around("log()")
    public Object logger(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            log.info("Start exec method '{}'",joinPoint.getSignature().getName());
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            log.error("Exec method '{}' error: ",joinPoint.getSignature().getName(), throwable);
            throw throwable;
        } finally {
            log.info("Exec method '{}' finished!",joinPoint.getSignature().getName());
        }
    }

    @Around("pointcut()")
    public Object fillResult(ProceedingJoinPoint joinPoint) {
        ResultVO resultVO = new ResultVO();
        // 参数校验，假设声明参数不能为null
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg == null) {
                resultVO.setStatus(false);
                resultVO.setMsg("参数非空校验不通过");
                return resultVO;
            }
        }
        // 执行
        try{
            resultVO.setData(joinPoint.proceed());
            resultVO.setStatus(true);
            resultVO.setMsg("成功");
        } catch (Throwable throwable) {
            resultVO.setStatus(false);
            resultVO.setMsg(throwable.getMessage());
        }
        // 封装结果集
        return resultVO;
    }
}
