package ex_06_Ternary_Operator;

import org.w3c.dom.ls.LSOutput;

public class Lab050_task {
    public static void main(String[] args) {
        int marks=80;

        String grade= (marks>=90 && marks<=100)?"A":(marks >=80 && marks <=89)?"B":(marks >=70 && marks <=79)?"C":(marks >=60 && marks <=69)?"D":"F";
        System.out.println(grade);

    }



}
