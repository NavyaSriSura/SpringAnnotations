package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);
        Movie movieFirst = (Movie) applicationContext.getBean("movie1");
        Movie moviesecond = (Movie) applicationContext.getBean("movie2");

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Configuration1.class);
        Movie movie = (Movie) applicationContext1.getBean("movie3");
        Movie movie3 = (Movie) applicationContext1.getBean("movie3");

        Movie movie2 = (Movie) applicationContext1.getBean("movie2");
        System.out.println(movieFirst.getActor());

        System.out.println(movie.getActor());
        System.out.println("Beans with Scope Prototype: Are they same?");
        System.out.println(movie == movie3);
        System.out.println("Beans with Scope Singleton: Are they same?");
        System.out.println(movieFirst == moviesecond);
    }

}
