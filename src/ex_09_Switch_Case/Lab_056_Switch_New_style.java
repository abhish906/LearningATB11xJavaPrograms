package ex_09_Switch_Case;
import java.util.Scanner;


public class Lab_056_Switch_New_style {
    public static void main(String[] args) {
        // take the input from user regarding which browser to use and start testing on that browser
        // new way to switch statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Please select the browser");

        String browser=sc.next();
        switch(browser)
        {
            case "chrome"->
                System.out.println("Proceeding with testing on chrome browser");

            case "edge"->
                System.out.println("Proceeding with testing on edge browser");

            case "firefox"->
                System.out.println("Proceeding with testing on firefox browser");

            default->
                System.out.println("Please select a correct browser");




        }
        sc.close();
    }

}
