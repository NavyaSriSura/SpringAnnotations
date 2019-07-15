package com.stackroute;

import com.stackroute.Demo.BeanLifeCycle;
import com.stackroute.Demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
    @Bean
    public Actor actorBean() {
        Actor actor = new Actor();
        actor.setName("Navya");
        actor.setGender("Female");
        actor.setAge(20);
        return actor;
    }

    @Bean(name = "movie1")

    public Movie movie1() {
        Movie movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifeCycle getMyFileSystemBean() {
        return new BeanLifeCycle();
    }
    @Bean
    public BeanPostProcessorDemoBean getBean(){
        return new BeanPostProcessorDemoBean();
    }
}
