package ex_22_Exception;

public class Lab118_exception_p2 {
    public static void main(String[] args) {
        try{
            int a[][]=new int[0][-3];

        } catch (Exception e) {
            System.out.println(e.toString());;
        }
    }
}
