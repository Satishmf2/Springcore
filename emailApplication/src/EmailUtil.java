import java.util.Scanner;

public class EmailUtil {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int  passwordlength=10;
    private int mailBoxCapacity;
    private String alternate;




    public EmailUtil(String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " +this.firstName + "." +this.lastName);
        this.department=setDepartment();
        System.out.println("The department is : " +this.department);
        System.out.println("1. Generate a email : " + this.firstName + "." + this.lastName+ "@" + this.department + "." +"gmail.com");

        this.password=setPassword(passwordlength);
        System.out.println("The password is : "+this.password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String setDepartment() {
        System.out.print("Enter the department \n1. Sales \n2. developement \n3.Accounting \n4. None");
        System.out.println(" ");
        Scanner in =new Scanner(System.in);
        int depart=in.nextInt();
        if(depart==1){
            return "sales";
        }else if(depart==2){
            return "developement";
        }else if(depart==3){
            return  "Accounting";
        }else{
            return "none";
        }


    }

    public String getPassword() {
        return password;
    }

    public String setPassword(int length) {
        String a="abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        char b[]=new char[length];
        for(int i=0;i<length;i++){
            int r= (int) (Math.random() * a.length());
            b[i]=a.charAt(r);

        }
        return String.valueOf(b);
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getAlternate() {
        return alternate;
    }

    public void setAlternate(String alternate) {
        this.alternate = alternate;
    }

    public String showInfo(){
        return "Name : " +this.firstName +" "+  this.lastName + "\n"+
                "Email :" +this.alternate + "'\n'"+
                "Mail Box capacity : "+this.mailBoxCapacity+"'\n'"+
                "Department : "+this.department;
    }
}
