package com.damein.damein.pipeline;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class PipeLineAspect {

    /**
     * 定义阀门invoke切点
     */
    @Pointcut(value = "this(com.damein.damein.pipeline.Valve) " +
            "&& execution(* invoke(com.damein.damein.pipeline.PipeLineContext)) && args((pipeLineContext))",
            argNames = "pipeLineContext")
    public void valveInvokeCutOffPoint(PipeLineContext pipeLineContext) {
    }

    @Before(value = "valveInvokeCutOffPoint(pipeLineContext)", argNames = "point,pipeLineContext")
    public void doBefore(JoinPoint point, PipeLineContext pipeLineContext) {
        int currentIndex = pipeLineContext.getAndIncrement();
        String className = point.getTarget().getClass().getName();
        log.info("管道前置通知-{}号阀门({})进入执行, pipeLineContext={}", currentIndex, className, pipeLineContext.toString());
    }
}
