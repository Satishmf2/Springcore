public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    public String getDailyWorkout(){
        return "Do workout for 30 mins daily ";
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
