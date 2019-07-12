package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import  org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration1 {
    @Bean
    public Actor actorBean()
    {
        Actor actor=new Actor();
        actor.setName("Navya");
        actor.setGender("Female");
        actor.setAge(20);
        return actor;
    }
    @Bean(name={"movie1","movie2"})
    @Scope("singleton")
    public Movie movieBean()
    {
        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }
    @Bean(name = "movie3")
    @Scope("prototype")
    public Movie movie3()
    {
        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}
