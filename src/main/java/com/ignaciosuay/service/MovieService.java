package com.ignaciosuay.service;

import com.ignaciosuay.domain.Movie;
import com.ignaciosuay.repository.MovieRepository;
import org.springframework.stereotype.Service;


/**
 * Created by natxo on 18/12/16.
 */
@Service
public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(Movie movie){
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }
}
