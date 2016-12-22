package com.ignaciosuay.service;

import com.ignaciosuay.domain.Movie;
import com.ignaciosuay.domain.Person;
import com.ignaciosuay.repository.MovieRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by natxo on 18/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieServiceTest {

    @Inject
    MovieRepository movieRepository;

    @Inject
    MovieService movieService;

    @Test
    public void createMovie() throws Exception {
        Person person = new Person();
        person.setName("suay");
        Movie movie = new Movie();
        movie.setTitle("suay the movie");
        movie.setActors(new HashSet<>(Arrays.asList(person)));
        Movie savedmovie = movieService.createMovie(movie);
        Movie one = movieRepository.findOne(savedmovie.getId());
        assertThat(one.getActors()).hasSize(1);
        assertThat(one.getDirector()).isNull();
    }

}