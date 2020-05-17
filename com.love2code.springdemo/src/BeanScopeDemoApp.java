import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach=context.getBean("myCoach", GolfCoach.class);

        Coach alphacoach=context.getBean("myCoach", GolfCoach.class);

        boolean result= (coach == alphacoach);

        System.out.println("Result : " +result);
        System.out.println("coach : " +coach);

        System.out.println("alphacoach : " +alphacoach);

        context.close();






    }
}
