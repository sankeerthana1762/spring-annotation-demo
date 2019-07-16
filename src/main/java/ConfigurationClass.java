import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass{

//	Movie Beans

    @Bean
    public Movie movieObj (){
        return new Movie(actorObj());
    }

    @Bean
    public Actor actorObj (){
        return new Actor("sivakarthikeyan","male",30);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifeCycle() {
        return new BeanLifecycleDemoBean();
    }

  }
