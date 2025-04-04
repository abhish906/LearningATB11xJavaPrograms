package ex_10_Loops;

public class Lab069_DoWhile {
    public static void main(String[] args) {
        int i=1;
        // do whhile executes the statement 1 time and then checks the condition
        do{
            System.out.println("Execute 1 time");
            System.out.println(i);
            i++;
        }while(i<10);

        // while loop check condition first

        int j=1;
        while(j<10){
            System.out.println(j);
            j++;
        }


    }
}
