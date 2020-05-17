public class LiteralvalueInjection implements FortuneService {

    private FortuneService fortuneService;
    private String emailaddress;
    private String location;

    //no-args
    public LiteralvalueInjection() {
        System.out.println("Setter injection needs no-args constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getFortune() {
        return "Inside Literal value injection ";
    }
}
