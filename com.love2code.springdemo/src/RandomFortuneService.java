import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String a[]={"Work Hard", "Think postivie", "Be Disciplined"};
    private Random random=new Random();

    @Override
    public String getFortune() {
        int index=random.nextInt(a.length);
        String f=a[index];
        System.out.println(" "+f);
        return f;
    }
}
