package com.tcf.springbasic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        //Calling student class bean
        
        Student s1=context.getBean(Student.class);
        
        //Calling sudent class method
        s1.display();
        
        //Calling teacher class bean
        Teacher t1=context.getBean(Teacher.class);
        
        //Calling teacher class method
        t1.show();
    }
}
