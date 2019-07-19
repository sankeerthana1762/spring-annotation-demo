import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass{
       //creating object for Movie class
        @Bean
        public Movie movieBean(){
            Movie movie = new Movie();
            movie.setActor(actorBean());
            return movie;
        }
        //creating object for Actor class
        @Bean
        public Actor actorBean (){
            return new Actor();
        }

    }
