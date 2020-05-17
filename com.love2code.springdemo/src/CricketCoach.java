public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice coding daily";
    }

    public CricketCoach() {
        System.out.println("Spring has called the default constructor while bean creation ");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method");
        this.fortuneService = fortuneService;
    }


    public FortuneService getFortuneService() {
        return fortuneService;
    }



    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
