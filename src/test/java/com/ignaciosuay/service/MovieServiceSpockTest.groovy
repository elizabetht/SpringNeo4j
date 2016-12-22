import com.ignaciosuay.SpringNeo4JApp
import com.ignaciosuay.domain.Movie
import com.ignaciosuay.domain.Person
import com.ignaciosuay.repository.MovieRepository
import com.ignaciosuay.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.genesis.Gen
import spock.genesis.generators.Generator
import spock.lang.Specification


@SpringBootTest(classes = SpringNeo4JApp.class)
class MovieServiceSpockTest extends Specification {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieService movieService;

    def "given a movie save it into the database"() {
        when:
        def movieSaved = movieService.createMovie(movie)
        then:
        movieRepository.findOne(movieSaved.getId())
        where:
        movie << getMovie().take(10)
    }

    Generator getMovie() {
        return Gen.type(Movie,
                title: Gen.string(20),
                director: getPerson()
        )
    }

    Generator getPerson() {
        return Gen.type(Person,
                name: Gen.string(10),
                birthday: Gen.string(10))
    }
}