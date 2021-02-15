import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld word = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld word1 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект"  + " - " + (word==word1));
        System.out.println(word);
        System.out.println(word);

        System.out.println("Переменные ссылаются на один и тот же объект"  + " - " + (cat==cat1));
        System.out.println(cat);
        System.out.println(cat1);


    }
}