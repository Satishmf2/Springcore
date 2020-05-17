import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContextfinal1.xml");
        Coach f=context.getBean("finalquiz",Coach.class);
        System.out.println(f.getDailyFortune());
        System.out.println(f.getDailyWorkout());


        context.close();
    }
}
