import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="catsay")
    @Scope("prototype")
    public Cat getCatSay() {
        Cat cat = new Cat((byte) 2, "male");
        cat.setMessage("Мяу");
        return cat;
    }
}