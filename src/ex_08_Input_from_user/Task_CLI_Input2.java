package ex_08_Input_from_user;

public class Task_CLI_Input2 {
    public static void main(String[] args) {
        //Take 2 input numbers from user and find the max using ternary operator
        String number1= args[0];
        String number2= args[1];

        int n1=Integer.parseInt(number1);
        int n2=Integer.parseInt(number2);

        String out= (n1>n2)?"n1 is max":"n2 is max";
        System.out.println(out);

    }
}
