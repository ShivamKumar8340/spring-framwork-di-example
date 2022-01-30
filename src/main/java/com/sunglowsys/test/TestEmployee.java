package com.sunglowsys.test;

import com.sunglowsys.config.ApplicationConfiguration;
import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Employee employee=(Employee) context.getBean(Employee.class);

        System.out.println();
        employee.setFirstName("shivam");


        System.out.println("Employee Name :" +employee.getFirstName());
        System.out.println();
        employee.newAddress();
    }
}
