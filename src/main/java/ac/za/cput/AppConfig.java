package ac.za.cput;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean(name="welcomer")
    public myInterface getService()
    {
        return new myIntImpl();
    }
}
