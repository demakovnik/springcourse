package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGEtStudentsLoggingAdvice: логгируем получение списка студентов перед методом getStudents");
    }*/

    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение списка студентов после работы метода getStudents");
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

    }*/
   /* @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentsLoggingAdvice: логгируем выброс исключения " + exception);
        System.out.println(exception.getMessage());
    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное" +
                "окончание работы метода или выброс исключения");
    }



}
