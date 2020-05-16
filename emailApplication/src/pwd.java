public class pwd {
    private static int length=10;

    public static void main(String[] args) {
        System.out.println("Generate pwd");
        password(length);
    }

       private static void password(int len) {
        String s="abcdefghijklmnopqrstuvwxyz012346789%^&*";
        char[] c=new char[len];
        for(int i=0;i<len;i++){
            int r= ((int)(Math.random() * s.length()));
            System.out.println(" Randome is : "+r);
            c[i]=s.charAt(r);
        }
           System.out.println("Value is : "+c.toString());
           System.out.println("The password is :" + new String(c));



    }
}
