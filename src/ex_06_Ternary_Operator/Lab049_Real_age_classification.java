package ex_06_Ternary_Operator;

public class Lab049_Real_age_classification {
    public static void main(String[] args) {
        int age=10;
        String output= (age>18)?((age>=65)?"Senior":"Adult"):"Minor";
        System.out.println(output);
    }
}
