/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
//        Resource r = new ClassPathResource("resources/spring.xml");
//        BeanFactory bf = new XmlBeanFactory(r);
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
        
        Employee emp = (Employee)ap.getBean("emp");
        Employee emp2 = (Employee)ap.getBean("emp");
        Employee emp3 = (Employee)ap.getBean("emp");
        Employee emp4 = (Employee)ap.getBean("emp");
        
        emp.setName("Imtiaz");
        
        emp.setName("kamran");
        System.out.println(emp.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
        
        
    }
}
