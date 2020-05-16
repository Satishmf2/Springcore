public class password {
    private static int length=10;
    public static void main(String[] args) {
        generate(length);
    }

    private static void generate(int l){
        System.out.println("Generation");
        String s = "abcdefghiljcklmnopqrstuvwxyz1234567890!@#$%^&^*()-";
        char c[]=new char[s.length()];
        for(int i=0;i<l;i++){
            int r = (int) (Math.random() * s.length());
            c[i]  =  s.charAt(r);
        }
        System.out.println("Pwd is : " + new String(c));

    }
}
