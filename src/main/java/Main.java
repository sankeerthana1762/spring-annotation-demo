import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {   //using ApplicationContext Interface
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Movie movie = context.getBean("movieObj1",Movie.class);
        movie.display();

    }
}
