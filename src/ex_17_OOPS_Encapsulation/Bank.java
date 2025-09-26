package ex_17_OOPS_Encapsulation;


public class Bank {
    public static void main(String[] args) {
        user u=new user("Abhi","1234");


        System.out.println(u.getUsername());
        System.out.println(u.getPassword());

        u.setUsername("Abhi906");
        System.out.println(u.getUsername());

        u.setPassword("abhi1234",false);
        System.out.println(u.getPassword());
        



    }
}
class user{
    private String username;
    private String password;
    user(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password,boolean isadmin)
    {
        if (isadmin)
        {
        this.password=password;
        }

        else {
            System.out.println("Don't change");
        }
    }



}
