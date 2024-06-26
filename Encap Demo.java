import java.util.*;
class Insta{
    private String username="fghj";
    private String password="hui";
    private long phno=1234567899l;
    
    void setName(String username)
    {
        this.username=username;
    }
    void setPass(String password)
    {
        this.password=password;
    }
    String getName()
    {
        return username;
    }
    String getPass()
    {
        return password;
    }
    long getPh()
    {
        return phno;
    }
}
public class User
{
    static Scanner sc=new Scanner(System.in);
    static Insta x=new Insta();
    static void login ()
    {
        System.out.print("\nPlease enter credentials to login");
        System.out.print("Username : ");
        String username=sc.next();
        System.out.print("\npassword : ");
        String password=sc.next();
        
        if(username.equals(x.getName()) && password.equals(x.getPass()))
        {
            System.out.println("Login successfull");
        }
        else if(!username.equals(x.getName()) && !password.equals(x.getPass()))
        {
            System.out.print("\nInvalid credentials \npress 1 to know your username or any key to exit : ");
            char ch=sc.next().charAt(0);
            if(ch=='1')
            {
                while(true){
                    System.out.print("\nplease enter your mobile number : ");
                    long phno=sc.nextLong();
                    if(phno==x.getPh())
                    {
                        System.out.println("\nyour username : "+x.getName());
                        login();
                        break;
                    }
                    else{
                        System.out.print("\nUser not found\npress 1 to re-enter mobile number or any key to exit");
                        char c=sc.next().charAt(0);
                        if(c!='1')
                        break;
                    }
                }
            }
        }
        else if(!username.equals(x.getName()))
        {
            System.out.print("\nInvalid username\npress 1 to reset : ");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.print("\nenter new username : ");
                x.setName(sc.next());
                System.out.print("\nyour new username : "+x.getName());
                login();
            }
        }
        else{
             System.out.print("\nInvalid password\npress 1 to reset : ");
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.print("\nenter new password : ");
                x.setPass(sc.next());
                System.out.print("\nyour new password : "+x.getPass());
                login();
            }
        }
    }
	public static void main(String[] args) {
	    login();
		System.out.println("Hello World");
	}
}