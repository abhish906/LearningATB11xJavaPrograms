package ex_09_Switch_Case;

import java.util.Scanner;

public class Lab054_Switch_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Day");
        int day=sc.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Incorrect value");
                break;
        }
        sc.close();




        }

    }



