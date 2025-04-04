package ex_09_Switch_Case;
import java.util.Scanner;


public class Lab_055_Switch_2 {
    public static void main(String[] args) {
        // take the input from user regarding which browser to use and start testing on that browser
        Scanner sc=new Scanner(System.in);
        System.out.println("Please select the browser");

        String browser=sc.next();
        switch(browser)
        {
            case "chrome":
                System.out.println("Proceeding with testing on chrome browser");
                break;
            case "edge":
                System.out.println("Proceeding with testing on edge browser");
                break;
            case "firefox":
                System.out.println("Proceeding with testing on firefox browser");
                break;
            default:
                System.out.println("Please select a correct browser");
                break;



        }
        sc.close();
    }

}
