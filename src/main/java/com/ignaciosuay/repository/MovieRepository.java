package com.ignaciosuay.repository;

import com.ignaciosuay.domain.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by natxo on 17/12/16.
 */
 public interface MovieRepository extends GraphRepository<Movie> {

}