import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Movie movie = context.getBean("movieObj",Movie.class);
        movie.display();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean =  (BeanPostProcessorDemoBean) context.getBean("beanPostProcessorDemo");
    }

}
