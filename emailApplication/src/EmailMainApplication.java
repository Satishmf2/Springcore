public class EmailMainApplication {
    public static void main(String[] args) {
        EmailUtil u=new EmailUtil("satish","kumar");
        u.setMailBoxCapacity(500);
        System.out.println(u.getMailBoxCapacity());
        u.setAlternate("rsatishgold@amazon.com");
        System.out.println(u.getAlternate());
        System.out.println(u.showInfo());
    }
}
