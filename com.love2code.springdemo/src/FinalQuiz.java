public class FinalQuiz implements Coach {
    private  FortuneService fortuneService;

    public FinalQuiz(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Move your body pig";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
