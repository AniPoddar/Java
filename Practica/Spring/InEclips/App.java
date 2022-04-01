package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class App 
{
    public static void main( String[] args )
    {
       Resource r = new ClassPathResource("applicationContext.xml");
       BeanFactory f = new XmlBeanFactory(r);
       
       Question q = (Question) f.getBean("al");
       q.displayInfo();
    }
}
