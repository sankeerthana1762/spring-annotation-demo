import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args )
    {   
        // using ApplicationContext interface
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean =  (BeanLifecycleDemoBean) context.getBean("beanLifeCycle");
    }

}
