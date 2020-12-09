package com.wangff.api;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.autoproxy.AbstractBeanFactoryAwareAdvisingPostProcessor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
@Component
public class AccessLimitBeanPostProcessor extends AbstractBeanFactoryAwareAdvisingPostProcessor implements InitializingBean {
    private Class<? extends Annotation> annotationType = AccessLimit.class;


    @Override
    public void afterPropertiesSet() throws Exception {
        Pointcut pointcut = new AnnotationMatchingPointcut(this.annotationType, true);
        this.advisor = new DefaultPointcutAdvisor(pointcut, createMethodAdvice());
    }

    private Advice createMethodAdvice() {
        return new MethodAccessLimitInterceptor();
    }
}
