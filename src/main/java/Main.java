import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie1 = context.getBean("movieBean",Movie.class);
        movie1.display();

        BeanFactory factory = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie2 = factory.getBean("movieBean",Movie.class);
        movie2.display();


    }
}
