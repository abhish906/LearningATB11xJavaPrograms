package ex_22_Exception;

public class Lab117_exceptions_p1 {

    public static void main(String[] args) {
        int a=0;
         try{
             int b=10/a;
         }
         catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
}
