package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    /*@Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: write log #4");
    }
*/


    /*@Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetOrReturnMethodsFromUniLibrary(){}

    @Before("allGetMethodsFromUniLibrary()")
    private void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    private void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetOrReturnMethodsFromUniLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeGetOrReturnLoggingAdvice: write log #3");
    }
*/

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice : логгирование попытки получить книгу/журнал");
    }

}
