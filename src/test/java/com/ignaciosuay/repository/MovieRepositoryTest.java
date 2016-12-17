package com.ignaciosuay.repository;

import com.ignaciosuay.SpringNeo4JApp;
import com.ignaciosuay.domain.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by natxo on 17/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieRepositoryTest {

    @Inject
    MovieRepository movieRepository;

    @Test
    public void findOneTest() throws Exception{
        Movie one = movieRepository.findOne(431l);
        assertThat(one).isNotNull();
    }
}