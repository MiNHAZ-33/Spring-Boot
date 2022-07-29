package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforelogger()
    {
        System.out.println("Loggers");
    }
    @After("execution(* *.*checkOut(..))")
    public void afterLogger()
    {
        System.out.println("Afrer logger");
    }
}
